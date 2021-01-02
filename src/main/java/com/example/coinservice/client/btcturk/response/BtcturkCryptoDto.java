package com.example.coinservice.client.btcturk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BtcturkCryptoDto {

    @JsonProperty("denominatorSymbol")
    private String denominatorSymbol;

    @JsonProperty("numeratorSymbol")
    private String numeratorSymbol;

    @JsonProperty("bid")
    private String bid;

    @JsonProperty("ask")
    private String ask;
}
