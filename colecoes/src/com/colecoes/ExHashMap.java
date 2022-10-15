package com.colecoes;

import java.util.HashMap;
import java.util.Map;

public class ExHashMap {

    public static void main(String[] args) {

/*Métodos herdados da interface map: clear(remove todos os mapeamentos). containsKey(verifica se uma chave já existe no mapeamento)
* containsValue(verifica se o valor já está presente no mapeamento). get(retorna o valor associado a uma chave)
* isEmpty(verifica se o mapeamento está vazio). KeySet(retorna um set contendo as chaves). put(adiciona um mapeamento)
* remove(remove um mapeamento). size(retorna o número de mapeamentos). values(retorna os valores)*/

        Map<Integer, String> alunos = new HashMap<Integer, String>();

        alunos.put(123, "Antonio");
        alunos.put(132, "Zeca");
        alunos.put(321, "Maria");
        alunos.put(121, "Katyusha");
        alunos.put(212, "Kalinka");

        System.out.println("Está vazia: " + alunos.isEmpty());
        System.out.println("Quantidade de alunos: " + alunos.size());
        System.out.println("Existe a matricula 132: " + alunos.containsKey(132));
        System.out.println("Existe o aluno Kalinka: " + alunos.containsValue("Kalinka"));
        System.out.println(alunos.values());


    }

}
