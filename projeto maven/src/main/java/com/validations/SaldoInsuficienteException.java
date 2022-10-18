package com.validations;

import com.mjv.Conta;

public class SaldoInsuficienteException extends Exception{

    private Conta conta;
    private double valor;

    public SaldoInsuficienteException(Conta conta, double valor){
        super();
        this.valor = valor;
        this.conta = conta;
    }
    @Override
    public String toString(){
        return "Olá!, " + this.conta.getCliente().getNome() + ". A tentativa de saque no valor de R$ " + this.valor
                + " não foi realizada, pois o saldo é inferior a este valor.\n"
                + "Saldo atual: R$ " + this.conta.getSaldo();
    }
}
