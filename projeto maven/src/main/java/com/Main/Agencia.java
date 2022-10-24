package com.Main;

import com.mjv.Banco;
import com.mjv.Cliente;
import com.mjv.ContaCorrente;
import com.mjv.ContaPoupanca;
import com.validations.ContaInexistenteException;
import com.validations.ContaInvalidaException;
import com.validations.SaldoInsuficienteException;
import com.validations.ValorInvalidoException;

public class Agencia {
    public static void main(String[] args) throws ValorInvalidoException, SaldoInsuficienteException, ContaInvalidaException, ContaInexistenteException {

        System.out.println("\n\n-------------------------------------------José-------------------------------------------\n\n");

        Cliente jose = new Cliente("José","123456789","154");
        ContaCorrente contaCorrenteJose = new ContaCorrente(jose);
        contaCorrenteJose.depositar(500d);
        contaCorrenteJose.sacar(200d);

        System.out.println("\n\n-------------------------------------------Antonio-------------------------------------------\n\n");

        Cliente antonio = new Cliente("Antônio","124578963","12456");
        ContaPoupanca contaPoupancaAntonio = new ContaPoupanca(antonio);
        contaPoupancaAntonio.depositar(953.25);
        contaPoupancaAntonio.sacar(267.14);
        contaPoupancaAntonio.renderJuros(3);
        System.out.println("\n\n-------------------------------------------Maria-------------------------------------------\n\n");

        Cliente maria = new Cliente("Maria","7894562548","3654125");
        ContaPoupanca contaPoupancaMaria = new ContaPoupanca(maria);
        contaPoupancaMaria.depositar(-25.5);
        contaPoupancaMaria.sacar(30.0);

        System.out.println("\n\n-------------------------------------------Inserindo contas no banco e pesquisando-------------------------------------------\n\n");


        Banco b = new Banco();
        b.inserirNovaConta(contaCorrenteJose);
        b.inserirNovaConta(contaPoupancaAntonio);
        b.inserirNovaConta(contaPoupancaMaria);


        System.out.println("\n---------------------------usando método pesquisar conta, passando o número da conta 2----------------------------\n");


        b.pesquisarConta(2);

    }
}
