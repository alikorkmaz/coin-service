package com.example.coinservice.client.btcturk;

import com.example.coinservice.client.btcturk.response.BtcturkHttpClientResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BtcturkHttpClient {

    private static final String URL = "https://api.btcturk.com/api/v2/ticker";

    public BtcturkHttpClientResponse get() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URL, BtcturkHttpClientResponse.class);
    }
}
