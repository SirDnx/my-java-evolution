package com.mjv;

public class ContaCorrente {

     private Double saldo = 0.0;

     public void depositar(Double valor){
         this.saldo += valor;
    }

    public void sacar(Double valor) {
        this.saldo -= valor;
    }

    public Double getSaldo(){
         return saldo;
    }
}
