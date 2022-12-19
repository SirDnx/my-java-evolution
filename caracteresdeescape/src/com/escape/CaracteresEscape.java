package com.escape;

public class CaracteresEscape {

    public static void main(String[] args) {

        String descricao = "Adicionando\n quebra de linha ";
        System.out.println(descricao);

        descricao = "Adicionando \tespaçamento com tabulação";
        System.out.println(descricao);

        descricao = "Adicionando aspas duplas \"sem comprometer as aspas da string\"";
        System.out.println(descricao);

    }
}