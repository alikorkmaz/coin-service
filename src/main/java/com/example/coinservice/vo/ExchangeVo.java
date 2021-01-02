package com.example.coinservice.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ExchangeVo {

    private String name;
    private Float commission;
    private List<PairVo> pairVoList;
}
