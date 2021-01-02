package com.example.coinservice.client.binance.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BinanceHttpClientResponse {

    List<BinanceCryptoDto> binanceCryptoDtoList;
}
