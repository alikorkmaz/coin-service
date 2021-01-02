package com.example.coinservice.client.paribu.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParibuHttpClientResponse {

    @JsonProperty("BTC_TL")
    private ParibuCryptoDto btc;

    @JsonProperty("ETH_TL")
    private ParibuCryptoDto eth;

    @JsonProperty("XRP_TL")
    private ParibuCryptoDto xrp;

    @JsonProperty("MKR_TL")
    private ParibuCryptoDto mkr;

    @JsonProperty("AVAX_TL")
    private ParibuCryptoDto avax;

    @JsonProperty("DOT_TL")
    private ParibuCryptoDto dot;

    @JsonProperty("XTZ_TL")
    private ParibuCryptoDto xtz;

    @JsonProperty("ATOM_TL")
    private ParibuCryptoDto atom;

    @JsonProperty("TRX_TL")
    private ParibuCryptoDto trx;

    @JsonProperty("HOT_TL")
    private ParibuCryptoDto hot;

    @JsonProperty("WAVES_TL")
    private ParibuCryptoDto waves;

    @JsonProperty("ONT_TL")
    private ParibuCryptoDto ont;

    @JsonProperty("LINK_TL")
    private ParibuCryptoDto link;

    @JsonProperty("CHZ_TL")
    private ParibuCryptoDto chz;

    @JsonProperty("RVN_TL")
    private ParibuCryptoDto rvn;

    @JsonProperty("BAT_TL")
    private ParibuCryptoDto bat;

    @JsonProperty("BTT_TL")
    private ParibuCryptoDto btt;

    @JsonProperty("LTC_TL")
    private ParibuCryptoDto ltc;

    @JsonProperty("BCH_TL")
    private ParibuCryptoDto bch;

    @JsonProperty("XLM_TL")
    private ParibuCryptoDto xlm;

    @JsonProperty("DOGE_TL")
    private ParibuCryptoDto doge;

    @JsonProperty("ADA_TL")
    private ParibuCryptoDto ada;

    @JsonProperty("NEO_TL")
    private ParibuCryptoDto neo;

    @JsonProperty("USDT_TL")
    private ParibuCryptoDto usdt;

    @JsonProperty("EOS_TL")
    private ParibuCryptoDto eos;

    @JsonProperty("GAL_TL")
    private ParibuCryptoDto gal;

    @JsonProperty("TRA_TL")
    private ParibuCryptoDto tra;

    @JsonProperty("JUV_TL")
    private ParibuCryptoDto juv;

    @JsonProperty("PSG_TL")
    private ParibuCryptoDto psg;
}
