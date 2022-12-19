package com.colecoes;

import java.util.ArrayList;

public class ExArrayList {

    public static void main(String[] args) {

        ArrayList informacoes = new ArrayList();
        Double valor = 85.20;
        int valor0 = 1;
        int valor1 = 5;
        String nome = "José";
        char sexo = 'M';

        informacoes.add(valor);
        informacoes.add(valor0);
        informacoes.add(valor1);
        informacoes.add(nome);
        informacoes.add(sexo);
        informacoes.add("exemplo");

        for(int i = 0; i < informacoes.size(); i++){
            System.out.println(informacoes.get(i));
        }

    }

}
