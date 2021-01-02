package com.example.coinservice.client.btcturk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BtcturkHttpClientResponse {

    @JsonProperty("data")
    private List<BtcturkCryptoDto> btcturkCryptoDtoList;
}
