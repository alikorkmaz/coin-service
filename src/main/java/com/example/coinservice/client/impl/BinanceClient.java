package com.example.coinservice.client.impl;

import com.example.coinservice.client.binance.BinanceHttpClient;
import com.example.coinservice.client.binance.converter.BinanceHttpClientResponseToExchangeVoConverter;
import com.example.coinservice.client.binance.response.BinanceHttpClientResponse;
import com.example.coinservice.client.ExchangeClient;
import com.example.coinservice.vo.ExchangeVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BinanceClient implements ExchangeClient {

    private final BinanceHttpClient binanceHttpClient;
    private final BinanceHttpClientResponseToExchangeVoConverter binanceHttpClientResponseToExchangeVoConverter;

    @Override
    public ExchangeVo getExchangeVo() {
        BinanceHttpClientResponse response = binanceHttpClient.get();
        return binanceHttpClientResponseToExchangeVoConverter.convert(response);
    }
}
