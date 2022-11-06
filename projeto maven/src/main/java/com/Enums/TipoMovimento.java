package com.Enums;

public enum TipoMovimento {

    CREDITO("C"),

    DEBITO("C");

    private String sigla;

    private TipoMovimento(String sigla){
        this.sigla = sigla;
    }

}
