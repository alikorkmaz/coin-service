package com.example.coinservice.client.btcturk.converter;

import com.example.coinservice.client.btcturk.response.BtcturkCryptoDto;
import com.example.coinservice.client.btcturk.response.BtcturkHttpClientResponse;
import com.example.coinservice.vo.ExchangeVo;
import com.example.coinservice.vo.PairVo;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BtcturkHttpClientResponseToExchangeVoConverter {

    private static final String NAME = "BTCTURK";
    private static final Float COMMISSION = 0.0015f;

    public ExchangeVo convert(BtcturkHttpClientResponse binanceHttpClientResponse) {
        ExchangeVo exchangeVo = new ExchangeVo();
        exchangeVo.setName(NAME);
        exchangeVo.setCommission(COMMISSION);
        exchangeVo.setPairVoList(convertPairVoList(binanceHttpClientResponse.getBtcturkCryptoDtoList()));
        return exchangeVo;
    }

    private List<PairVo> convertPairVoList(List<BtcturkCryptoDto> binanceCryptoDtoList) {
        return binanceCryptoDtoList.stream()
                .map(this::convertPairVo)
                .collect(Collectors.toList());
    }

    private PairVo convertPairVo(BtcturkCryptoDto btcturkCryptoDto) {
        PairVo pairVo = new PairVo();
        pairVo.setBase(btcturkCryptoDto.getDenominatorSymbol());
        pairVo.setName(btcturkCryptoDto.getNumeratorSymbol());
        pairVo.setBid(Float.valueOf(btcturkCryptoDto.getBid()));
        pairVo.setAsk(Float.valueOf(btcturkCryptoDto.getAsk()));
        return pairVo;
    }
}
