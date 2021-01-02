package com.example.coinservice.client.binance.converter;

import com.example.coinservice.client.binance.response.BinanceCryptoDto;
import com.example.coinservice.client.binance.response.BinanceHttpClientResponse;
import com.example.coinservice.vo.ExchangeVo;
import com.example.coinservice.vo.PairVo;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BinanceHttpClientResponseToExchangeVoConverter {

    private static final String NAME = "BINANCE";
    private static final Float COMMISSION = 0.001f;

    public ExchangeVo convert(BinanceHttpClientResponse binanceHttpClientResponse) {
        ExchangeVo exchangeVo = new ExchangeVo();
        exchangeVo.setName(NAME);
        exchangeVo.setCommission(COMMISSION);
        exchangeVo.setPairVoList(convertPairVoList(binanceHttpClientResponse.getBinanceCryptoDtoList()));
        return exchangeVo;
    }

    private List<PairVo> convertPairVoList(List<BinanceCryptoDto> binanceCryptoDtoList) {
        return binanceCryptoDtoList.stream()
                .filter(binanceCryptoDto -> binanceCryptoDto.getSymbol().contains("BTC") || binanceCryptoDto.getSymbol().contains("USDT"))
                .map(this::convertPairVo)
                .collect(Collectors.toList());
    }

    private PairVo convertPairVo(BinanceCryptoDto binanceCryptoDto) {
        PairVo pairVo = new PairVo();
        pairVo.setBid(Float.valueOf(binanceCryptoDto.getPrice()));
        pairVo.setAsk(Float.valueOf(binanceCryptoDto.getPrice()));
        String symbol = binanceCryptoDto.getSymbol();
        if (symbol.startsWith("BTC")) {
            pairVo.setName("BTC");
            pairVo.setBase(symbol.replace("BTC", ""));
        } else if (symbol.endsWith("BTC")) {
            pairVo.setName(symbol.replace("BTC", ""));
            pairVo.setBase("BTC");
        } else if (symbol.startsWith("USDT")) {
            pairVo.setName("USDT");
            pairVo.setBase(symbol.replace("USDT", ""));
        } else if (symbol.endsWith("USDT")) {
            pairVo.setName(symbol.replace("USDT", ""));
            pairVo.setBase("BTC");
        }
        return pairVo;
    }
}
