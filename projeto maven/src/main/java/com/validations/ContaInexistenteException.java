package com.validations;

import com.mjv.Conta;

public class ContaInexistenteException extends Exception{

    public ContaInexistenteException(Conta conta){
        super("A conta informada não pode ser inserida, pois não existe!");
    }
}
