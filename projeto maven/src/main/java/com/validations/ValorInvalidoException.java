package com.validations;

import com.mjv.Conta;

public class ValorInvalidoException extends Exception{

    private Conta conta;
    private double valor;

    public ValorInvalidoException(Conta conta, double valor){
        super();
        this.conta = conta;
        this.valor = valor;
    }

    @Override
    public String toString(){
        return "Olá!, " + this.conta.getCliente().getNome() + ". A tentativa de deposito no valor de R$ " + this.valor
                + " não foi realizada, pois o deposito deve ser superior a R$ 0.0.";
    }
}
