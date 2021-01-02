package com.example.coinservice.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PairVo {

    private String name;
    private String base;
    private Float ask;
    private Float bid;
}
