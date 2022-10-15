package com.colecoes;

import java.util.HashSet;
import java.util.Set;

public class ExHashSet {

    /* A interface Set e a classe HashSet (não armazena elementos duplicados) só herdam da interface collection.
     * <String> restringe o conteúdo a ser inserido no set somente a objetos do tipo
     * String. Métodos herdados na interface collection: add(adiciona um objeto no set).
     * clear(Remove todos os objetos do set). contains(verifica a existencia do objeto no set).
     * isEmpty(Verifica se o set está vazio). remove(remove um objeto do set).
     * size(retorna a quantidade de objetos no set). toArray(retorna um array contendo os objetos do set)*/

    public static void main(String[] args) {

        Set<String> cesta = new HashSet<String>();

        System.out.println(cesta.isEmpty());

        cesta.add("Maçã");
        cesta.add("Maçã");
        cesta.add("Maçã");
        cesta.add("Banana");

        System.out.println(cesta.isEmpty());
        System.out.println(cesta.size());
        System.out.println(cesta);



    }

}
