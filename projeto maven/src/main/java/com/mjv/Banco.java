package com.mjv;

import java.util.List;
import java.util.ArrayList;
import com.validations.ContaInvalidaException;
import static java.lang.String.valueOf;

public class Banco {

    private String nome;
    private List<Conta>  contas = new ArrayList<Conta>();
    private Conta conta;

    public Banco(Conta conta){
        contas.add(conta);
    }

    public void inserirNovaConta(Conta conta){
            contas.add(conta);
    }

    public void pesquisarConta(Conta conta){
        this.conta = conta;
        for(int y = 0; y < contas.size(); y++){
            if(contas.get(y).getNumero() == conta.getNumero()){
                System.out.println(imprimirDados());
            }
        }
    }

    private String imprimirDados(){
        return
        "Títular: " + this.conta.getCliente().getNome() + "\n" +
        "Agencia: " + this.conta.getAgencia() + "\n" +
        "Numero: " + this.conta.getNumero() + "\n" +
        "Saldo: " + this.conta.getSaldo();
    }

    public void acessarListaContas(){
        for(int x = 0; x < contas.size() ; x++){
            System.out.println(contas.get(x).getCliente().getNome());
            System.out.println(contas.get(x).getNumero());
        }
    }
}
