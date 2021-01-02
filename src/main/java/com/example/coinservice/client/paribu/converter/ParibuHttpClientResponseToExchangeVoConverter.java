package com.example.coinservice.client.paribu.converter;

import com.example.coinservice.client.paribu.response.ParibuHttpClientResponse;
import com.example.coinservice.vo.ExchangeVo;
import com.example.coinservice.vo.PairVo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ParibuHttpClientResponseToExchangeVoConverter {

    private final static String NAME = "PARIBU";
    private final static Float COMMISSION = 0.0015f;


    public ExchangeVo convert(ParibuHttpClientResponse paribuHttpClientResponse) {
        ExchangeVo exchangeVo = new ExchangeVo();
        exchangeVo.setName(NAME);
        exchangeVo.setCommission(COMMISSION);
        exchangeVo.setPairVoList(convertPairVos(paribuHttpClientResponse));
        return exchangeVo;
    }

    private List<PairVo> convertPairVos(ParibuHttpClientResponse paribuHttpClientResponse) {
        return List.of(convertBtcPairVo(paribuHttpClientResponse),
                convertEthPairVo(paribuHttpClientResponse),
                convertXrpPairVo(paribuHttpClientResponse),
                convertMkrPairVo(paribuHttpClientResponse),
                convertAvaxPairVo(paribuHttpClientResponse),
                convertDotPairVo(paribuHttpClientResponse),
                convertXtzPairVo(paribuHttpClientResponse),
                convertAtomPairVo(paribuHttpClientResponse),
                convertTrxPairVo(paribuHttpClientResponse),
                convertHotPairVo(paribuHttpClientResponse),
                convertWavesPairVo(paribuHttpClientResponse),
                convertOntPairVo(paribuHttpClientResponse),
                convertLinkPairVo(paribuHttpClientResponse),
                convertChzPairVo(paribuHttpClientResponse),
                convertRvnPairVo(paribuHttpClientResponse),
                convertBatPairVo(paribuHttpClientResponse),
                convertBttPairVo(paribuHttpClientResponse),
                convertLtcPairVo(paribuHttpClientResponse),
                convertBchPairVo(paribuHttpClientResponse),
                convertXlmPairVo(paribuHttpClientResponse),
                convertDogePairVo(paribuHttpClientResponse),
                convertAdaPairVo(paribuHttpClientResponse),
                convertNeoPairVo(paribuHttpClientResponse),
                convertUsdtPairVo(paribuHttpClientResponse),
                convertEosPairVo(paribuHttpClientResponse),
                convertGalPairVo(paribuHttpClientResponse),
                convertTraPairVo(paribuHttpClientResponse),
                convertJuvPairVo(paribuHttpClientResponse),
                convertPsgPairVo(paribuHttpClientResponse));
    }

    private PairVo convertBtcPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo btcPairVo = new PairVo();
        btcPairVo.setName("BTC");
        btcPairVo.setBase("TRY");
        btcPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getBtc().getAsk()));
        btcPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getBtc().getBid()));
        return btcPairVo;
    }

    private PairVo convertEthPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo ethPairVo = new PairVo();
        ethPairVo.setName("ETH");
        ethPairVo.setBase("TRY");
        ethPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getEth().getAsk()));
        ethPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getEth().getBid()));
        return ethPairVo;
    }

    private PairVo convertXrpPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo xrpPairVo = new PairVo();
        xrpPairVo.setName("XRP");
        xrpPairVo.setBase("TRY");
        xrpPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getXrp().getAsk()));
        xrpPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getXrp().getBid()));
        return xrpPairVo;
    }

    private PairVo convertMkrPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo mkrPairVo = new PairVo();
        mkrPairVo.setName("MKR");
        mkrPairVo.setBase("TRY");
        mkrPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getMkr().getAsk()));
        mkrPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getMkr().getBid()));
        return mkrPairVo;
    }

    private PairVo convertAvaxPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo avaxPairVo = new PairVo();
        avaxPairVo.setName("AVAX");
        avaxPairVo.setBase("TRY");
        avaxPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getAvax().getAsk()));
        avaxPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getAvax().getBid()));
        return avaxPairVo;
    }

    private PairVo convertDotPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo dotPairVo = new PairVo();
        dotPairVo.setName("DOT");
        dotPairVo.setBase("TRY");
        dotPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getDot().getAsk()));
        dotPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getDot().getBid()));
        return dotPairVo;
    }

    private PairVo convertXtzPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo xtzPairVo = new PairVo();
        xtzPairVo.setName("XTZ");
        xtzPairVo.setBase("TRY");
        xtzPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getXtz().getAsk()));
        xtzPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getXtz().getBid()));
        return xtzPairVo;
    }

    private PairVo convertAtomPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo atomPairVo = new PairVo();
        atomPairVo.setName("ATOM");
        atomPairVo.setBase("TRY");
        atomPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getAtom().getAsk()));
        atomPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getAtom().getBid()));
        return atomPairVo;
    }

    private PairVo convertTrxPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo trxPairVo = new PairVo();
        trxPairVo.setName("TRX");
        trxPairVo.setBase("TRY");
        trxPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getTrx().getAsk()));
        trxPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getTrx().getBid()));
        return trxPairVo;
    }

    private PairVo convertHotPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo hotPairVo = new PairVo();
        hotPairVo.setName("HOT");
        hotPairVo.setBase("TRY");
        hotPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getHot().getAsk()));
        hotPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getHot().getBid()));
        return hotPairVo;
    }

    private PairVo convertWavesPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo wavesPairVo = new PairVo();
        wavesPairVo.setName("WAVES");
        wavesPairVo.setBase("TRY");
        wavesPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getWaves().getAsk()));
        wavesPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getWaves().getBid()));
        return wavesPairVo;
    }

    private PairVo convertOntPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo ontPairVo = new PairVo();
        ontPairVo.setName("ONT");
        ontPairVo.setBase("TRY");
        ontPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getOnt().getAsk()));
        ontPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getOnt().getBid()));
        return ontPairVo;
    }

    private PairVo convertLinkPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo linkPairVo = new PairVo();
        linkPairVo.setName("LINK");
        linkPairVo.setBase("TRY");
        linkPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getLink().getAsk()));
        linkPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getLink().getBid()));
        return linkPairVo;
    }

    private PairVo convertChzPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo chzPairVo = new PairVo();
        chzPairVo.setName("CHZ");
        chzPairVo.setBase("TRY");
        chzPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getChz().getAsk()));
        chzPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getChz().getBid()));
        return chzPairVo;
    }

    private PairVo convertRvnPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo rvnPairVo = new PairVo();
        rvnPairVo.setName("RVN");
        rvnPairVo.setBase("TRY");
        rvnPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getRvn().getAsk()));
        rvnPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getRvn().getBid()));
        return rvnPairVo;
    }

    private PairVo convertBatPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo batPairVo = new PairVo();
        batPairVo.setName("BAT");
        batPairVo.setBase("TRY");
        batPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getBat().getAsk()));
        batPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getBat().getBid()));
        return batPairVo;
    }

    private PairVo convertBttPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo bttPairVo = new PairVo();
        bttPairVo.setName("BTT");
        bttPairVo.setBase("TRY");
        bttPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getBtt().getAsk()));
        bttPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getBtt().getBid()));
        return bttPairVo;
    }

    private PairVo convertLtcPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo ltcPairVo = new PairVo();
        ltcPairVo.setName("LTC");
        ltcPairVo.setBase("TRY");
        ltcPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getLtc().getAsk()));
        ltcPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getLtc().getBid()));
        return ltcPairVo;
    }

    private PairVo convertBchPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo bchPairVo = new PairVo();
        bchPairVo.setName("BCH");
        bchPairVo.setBase("TRY");
        bchPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getBch().getAsk()));
        bchPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getBch().getBid()));
        return bchPairVo;
    }

    private PairVo convertXlmPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo xlmPairVo = new PairVo();
        xlmPairVo.setName("XLM");
        xlmPairVo.setBase("TRY");
        xlmPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getXlm().getAsk()));
        xlmPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getXlm().getBid()));
        return xlmPairVo;
    }

    private PairVo convertDogePairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo dogePairVo = new PairVo();
        dogePairVo.setName("DOGE");
        dogePairVo.setBase("TRY");
        dogePairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getDoge().getAsk()));
        dogePairVo.setBid(Float.valueOf(paribuHttpClientResponse.getDoge().getBid()));
        return dogePairVo;
    }

    private PairVo convertAdaPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo adaPairVo = new PairVo();
        adaPairVo.setName("ADA");
        adaPairVo.setBase("TRY");
        adaPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getAda().getAsk()));
        adaPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getAda().getBid()));
        return adaPairVo;
    }

    private PairVo convertNeoPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo neoPairVo = new PairVo();
        neoPairVo.setName("NEO");
        neoPairVo.setBase("TRY");
        neoPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getNeo().getAsk()));
        neoPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getNeo().getBid()));
        return neoPairVo;
    }

    private PairVo convertUsdtPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo usdtPairVo = new PairVo();
        usdtPairVo.setName("USDT");
        usdtPairVo.setBase("TRY");
        usdtPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getUsdt().getAsk()));
        usdtPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getUsdt().getBid()));
        return usdtPairVo;
    }

    private PairVo convertEosPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo eosPairVo = new PairVo();
        eosPairVo.setName("EOS");
        eosPairVo.setBase("TRY");
        eosPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getEos().getAsk()));
        eosPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getEos().getBid()));
        return eosPairVo;
    }

    private PairVo convertGalPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo galPairVo = new PairVo();
        galPairVo.setName("GAL");
        galPairVo.setBase("TRY");
        galPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getGal().getAsk()));
        galPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getGal().getBid()));
        return galPairVo;
    }

    private PairVo convertTraPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo traPairVo = new PairVo();
        traPairVo.setName("TRA");
        traPairVo.setBase("TRY");
        traPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getTra().getAsk()));
        traPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getTra().getBid()));
        return traPairVo;
    }

    private PairVo convertJuvPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo juvPairVo = new PairVo();
        juvPairVo.setName("JUV");
        juvPairVo.setBase("TRY");
        juvPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getJuv().getAsk()));
        juvPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getJuv().getBid()));
        return juvPairVo;
    }

    private PairVo convertPsgPairVo(ParibuHttpClientResponse paribuHttpClientResponse) {
        PairVo psgPairVo = new PairVo();
        psgPairVo.setName("PSG");
        psgPairVo.setBase("TRY");
        psgPairVo.setAsk(Float.valueOf(paribuHttpClientResponse.getPsg().getAsk()));
        psgPairVo.setBid(Float.valueOf(paribuHttpClientResponse.getPsg().getBid()));
        return psgPairVo;
    }
}
