package com.exceptionex;

public class ExcecaoValorInvalido extends Exception{
    public ExcecaoValorInvalido (double valor){
        super("O valor a ser depositado deve ser superior a R$ 0.00");
    }
}
