package com.example.coinservice.client.paribu.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParibuCryptoDto {

    @JsonProperty("lowestAsk")
    private String ask;

    @JsonProperty("highestBid")
    private String bid;
}
