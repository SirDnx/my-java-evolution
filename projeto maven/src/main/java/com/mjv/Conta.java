package com.mjv;

import com.interfaces.InterfaceConta;
import com.validations.SaldoInsuficienteException;
import com.validations.ValorInvalidoException;

public class Conta implements InterfaceConta{

    private static final int AGENCIA = 5;
    private static int incremento = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected boolean cancelada; //já é setada como falsa por ser primitivo boolean

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA;
        this.cliente = cliente;
        this.numero = incremento ++;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        try{
            if (valor > getSaldo()){
                throw new SaldoInsuficienteException(this, valor);
            }
            this.saldo -= valor;
            System.out.println(informarSaque());
        }catch(SaldoInsuficienteException e){
            System.out.println(e);
        }

    }

    public void depositar(double valor) throws ValorInvalidoException {
        try{
            if(valor <= 0){
                throw new ValorInvalidoException(this, valor);
            }
            this.saldo += valor;
            System.out.println(informarDeposito());
        }catch(ValorInvalidoException e){
            System.out.println(e);
        }

    }

    public void transferir(double valor, InterfaceConta contaDestino) throws SaldoInsuficienteException, ValorInvalidoException {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    public double getSaldo(){
        return this.saldo;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public int getNumero(){
        return this.numero;
    }

    private String informarDeposito(){
        return "Deposito realizado com sucesso!\n"
                + "Saldo atual: R$ " + this.saldo ;
    }

    private String informarSaque(){
        return "Saque realizado com sucesso!\n"
                + "Saldo atual: R$ " + this.saldo;
    }
}
