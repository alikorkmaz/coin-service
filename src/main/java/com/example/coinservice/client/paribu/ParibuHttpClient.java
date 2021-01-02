package com.example.coinservice.client.paribu;

import com.example.coinservice.client.paribu.response.ParibuHttpClientResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ParibuHttpClient {

    private static final String URL = "http://coin-serv.herokuapp.com/paribu";

    public ParibuHttpClientResponse get() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URL, ParibuHttpClientResponse.class);
    }
}
