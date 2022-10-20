package com.validations;

import com.mjv.Conta;

public class ContaInvalidaException extends Exception{

    public ContaInvalidaException(int numero){
        super(String.format("A conta de numero %d não existe!", numero));
    }
}
