package com.example.coinservice.client.impl;

import com.example.coinservice.client.btcturk.BtcturkHttpClient;
import com.example.coinservice.client.btcturk.converter.BtcturkHttpClientResponseToExchangeVoConverter;
import com.example.coinservice.client.btcturk.response.BtcturkHttpClientResponse;
import com.example.coinservice.client.ExchangeClient;
import com.example.coinservice.vo.ExchangeVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BtcturkClient implements ExchangeClient {

    private final BtcturkHttpClient btcturkHttpClient;
    private final BtcturkHttpClientResponseToExchangeVoConverter btcturkHttpClientResponseToExchangeVoConverter;

    @Override
    public ExchangeVo getExchangeVo() {
        BtcturkHttpClientResponse btcturkHttpClientResponse = btcturkHttpClient.get();
        return btcturkHttpClientResponseToExchangeVoConverter.convert(btcturkHttpClientResponse);
    }
}
