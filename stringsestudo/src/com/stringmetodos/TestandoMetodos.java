package com.stringmetodos;

import java.util.Arrays;

public class TestandoMetodos {

    public static void main(String[] args) {

        System.out.println("\n------------------------------------------Método concat\n");

        MetodoConcat mc = new MetodoConcat();
        System.out.println(mc.propaganda);

        System.out.println("\n------------------------------------------Método Equals\n");

        MetodoEquals me = new MetodoEquals();
        System.out.println("TESTE 1:" + me.nome.equals(me.nome1));/*Compara o conteúdo dos objetos, Sensitive Case*/
        System.out.println("TESTE 2:" + me.nome.equalsIgnoreCase(me.nome1));/*Compara sem Sensitive Case*/
        System.out.println("TESTE 3:" + me.nome.equals(me.nome2));/*retorna true, pois o valor dos objetos são idênticos*/
        boolean teste = (me.nome == me.nome2); /*Compara o endereço dos objetos na memória*/
        System.out.println("TESTE 4:" + teste);

        teste = (me.nome3 == me.nome4);/*retorna true, porque não foi usado o operador new, essas strings estão no pool de Strings, estão no mesmo endereço de memória, ele será igual*/
        System.out.println("TESTE 5:" + teste);

        System.out.println("\n------------------------------------------Método Starts, Ends with\n");

        MetodoEndsStartsWith msew = new MetodoEndsStartsWith();
        System.out.println(msew.descricao.length());
        System.out.println(msew.descricao.startsWith("Frase"));
        System.out.println(msew.descricao.endsWith("h"));

        System.out.println("\n------------------------------------------Método CharAt\n");

        MetodoCharAt mca = new MetodoCharAt();
        System.out.println("Caractere no indice 1: " + mca.descricao.charAt(1));
        System.out.println("Primeira ocorrência do caractere \"Z\" com o método indexOf: " + mca.descricao.indexOf("z"));/*retorna -1 pq a string passada não tem o caractere z*/
        System.out.println("Ultima ocorrencia da palavra \"teste\" com o método lastIndexOf: " + mca.descricao.lastIndexOf("teste"));

        System.out.println("\n------------------------------------------Método replace\n");

        MetodoReplace mr = new MetodoReplace();
        System.out.println(mr.descricao.replace(" ", "."));

        System.out.println("\n------------------------------------------Método split\n");

        MetodoSplit ms = new MetodoSplit();
        System.out.println(Arrays.toString(ms.descricao.split(" ")));

        System.out.println("\n------------------------------------------Método toLowerCase, toUpperCase\n");

        MetodoTolowerUpperCase mtluc = new MetodoTolowerUpperCase();
        System.out.println(mtluc.descricao.toUpperCase());
        System.out.println(mtluc.descricao.toLowerCase());

        System.out.println("\n------------------------------------------substring\n");

        MetodoSubstring msb = new MetodoSubstring();
        System.out.println(msb.descricao.substring(0,10));/*vai criar uma nova string do índice 0 ao 10*/
        System.out.println(msb.descricao.substring(10));/*vai criar uma nova string do índice 10 ao fim*/


    }
}

class MetodoConcat{

    String nome = new String("Banana");
    String descricao = new String("a melhor fruta do mundo!");
    String propaganda = nome.concat(", ").concat(descricao);
}

class MetodoEquals{

    String nome = new String("maçã");
    String nome1 = new String("Maçã");
    String nome2 = new String("maçã");

    String nome3 = "maçã";
    String nome4 = "maçã";
}

class MetodoEndsStartsWith{
    String descricao = "Frase de exemplo para o teste do método StartsWith, EndsWith";
}

class MetodoCharAt{
    String descricao = "Frase de exemplo para o teste do método charAt";
}

class MetodoReplace{
    String descricao = "Frase de exemplo para o teste do método replace";
}

class MetodoSplit{
    String descricao = "Frase de exemplo para o teste do método split";
}

class MetodoTolowerUpperCase{
    String descricao = "Frase de exemplo para o teste do método toLowerCase, toUpperCase";
}


class MetodoSubstring{
    String descricao = "Frase de exemplo para o teste do método substring";
}
