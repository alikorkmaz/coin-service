package com.example.coinservice;

import com.example.coinservice.client.impl.BtcturkClient;
import com.example.coinservice.vo.ExchangeVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final BtcturkClient paribuClient;

    @GetMapping("/test")
    public ExchangeVo get(){
        return paribuClient.getExchangeVo();
    }
}
