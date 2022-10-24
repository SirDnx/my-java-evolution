package com.mjv;


import com.validations.ValorInvalidoException;
public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void renderJuros(double taxa) throws ValorInvalidoException{

        depositar(getSaldo() * (taxa/100));

    }


}
