package com.example.coinservice.client.binance.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BinanceCryptoDto {

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("price")
    private String price;
}
