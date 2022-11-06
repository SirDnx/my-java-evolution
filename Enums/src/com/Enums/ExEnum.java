package com.Enums;

public enum ExEnum {

    CREDITO("C"),
    DEBITO("D");

    private String sigla;

    private ExEnum(String sigla){
        this.sigla = sigla;
    }

}
