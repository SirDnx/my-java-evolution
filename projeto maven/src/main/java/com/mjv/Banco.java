package com.mjv;

import java.util.HashMap;
import java.util.Map;

import com.validations.ContaInexistenteException;
import com.validations.ContaInvalidaException;
import static java.lang.String.valueOf;

public class Banco {

    private String nome;
    private Map<Integer, Conta> contas = new HashMap<Integer, Conta>();
    private Conta conta;


    public void inserirNovaConta(Conta conta) throws ContaInexistenteException{
        try{
            if(conta == null){
                throw new ContaInexistenteException(conta);
            }
            contas.put(conta.getNumero(), conta);
        }catch(ContaInexistenteException e){
            System.out.println(e);
        }
    }

    public void pesquisarConta(Integer numero) throws ContaInvalidaException {
        try{
            if(numero == null){
                throw new ContaInvalidaException(numero);
            }
            this.conta = contas.get(numero);
            System.out.println(imprimirDados());
        }catch(ContaInvalidaException e){
            System.out.println(e);
        }catch(NullPointerException e){
            System.out.println("Conta inexistente!");
        }
    }

    private String imprimirDados(){
        return
            "Títular: " + this.conta.getCliente().getNome() + "\n" +
            "Agencia: " + this.conta.getAgencia() + "\n" +
            "Numero: " + this.conta.getNumero() + "\n" +
            "Saldo: " + this.conta.getSaldo();
    }

    public void acessarLista(){
        for(int x = 1; x <= contas.size(); x++){
            StringBuilder sb = new StringBuilder();
            sb.append(contas.get(x).getCliente().getNome()).append(". Numero: ").append(contas.get(x).getNumero());
            System.out.println(sb.toString());
        }
    }
}
