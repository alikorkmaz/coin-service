package com.example.coinservice.client.binance;

import com.example.coinservice.client.binance.response.BinanceCryptoDto;
import com.example.coinservice.client.binance.response.BinanceHttpClientResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Objects;

@Service
public class BinanceHttpClient {

    private static final String URL = "https://api.binance.com/api/v3/ticker/price";

    public BinanceHttpClientResponse get() {
        RestTemplate restTemplate = new RestTemplate();
        BinanceCryptoDto[] binanceCryptoDtos = restTemplate.getForObject(URL, BinanceCryptoDto[].class);
        BinanceHttpClientResponse binanceHttpClientResponse = new BinanceHttpClientResponse();
        binanceHttpClientResponse.setBinanceCryptoDtoList(Arrays.asList(Objects.requireNonNull(binanceCryptoDtos)));
        return binanceHttpClientResponse;
    }
}
