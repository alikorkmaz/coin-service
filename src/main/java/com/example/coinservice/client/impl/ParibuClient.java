package com.example.coinservice.client.impl;


import com.example.coinservice.client.ExchangeClient;
import com.example.coinservice.client.paribu.ParibuHttpClient;
import com.example.coinservice.client.paribu.converter.ParibuHttpClientResponseToExchangeVoConverter;
import com.example.coinservice.client.paribu.response.ParibuHttpClientResponse;
import com.example.coinservice.vo.ExchangeVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ParibuClient implements ExchangeClient {

    private final ParibuHttpClient paribuHttpClient;
    private final ParibuHttpClientResponseToExchangeVoConverter paribuHttpClientResponseToExchangeVoConverter;

    @Override
    public ExchangeVo getExchangeVo(){
        ParibuHttpClientResponse response = paribuHttpClient.get();
        return paribuHttpClientResponseToExchangeVoConverter.convert(response);
    }
}
