package com.interfaces;

import com.validations.SaldoInsuficienteException;
import com.validations.ValorInvalidoException;

public interface InterfaceConta {

    void sacar(double valor) throws SaldoInsuficienteException;

    void depositar(double valor) throws ValorInvalidoException;

    void transferir(double valor, InterfaceConta contaDestino) throws SaldoInsuficienteException, ValorInvalidoException;


}
