package com.loopwhile;

public class LoopWhile {

    public static void main(String[] args) {

        Produtos p = new Produtos();
        p.setQtdProdutos(60);
        p.registrar();

    }
}

class Produtos {

    int qtdProduto;
    int registro = 0;

    public void setQtdProdutos(int numero){
        qtdProduto = numero;
    }

    public void registrar(){

        while(registro < qtdProduto){
            registro++;
            System.out.printf("O produto %d foi registrado \n", registro);
        }
    }
}
