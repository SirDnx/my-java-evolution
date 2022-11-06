package com.Main;

import com.mjv.*;
import com.validations.ContaInexistenteException;
import com.validations.ContaInvalidaException;
import com.validations.SaldoInsuficienteException;
import com.validations.ValorInvalidoException;

public class Agencia {
    public static void main(String[] args) throws ValorInvalidoException, SaldoInsuficienteException, ContaInvalidaException, ContaInexistenteException {

        Cliente raimundo = new Cliente("RAIMUNDO NONATO LOUREIRO CASTELO BRANCO", "135.217.791-18");
        Conta contaRaimundo = new ContaCorrente(raimundo);
        contaRaimundo.depositar(127548);


    }
}
