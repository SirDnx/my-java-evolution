package classes.estudos;

import java.util.Random;

public class ClasseVariaveisLocais {

    //variaveis locais sao as criadas dentro de construtures ou metodos
    //so podem ser acessadas dentro dos limites desses construtores ou metodos
    //uma variavel local nao possui valor padrao como os atributos de uma classe
    //ao ser criada deve ser atribuido um valor a ela, caso contrario nao sera compilado

    public static void criarVariavelLocal(){
        String variavelLocal = "esta e uma variavel local de um metodo.";

        System.out.println("valor da variavel local variavelLocal: ".concat(variavelLocal));
    }

    /*public static void criarVariavelLocalSemValor(){
        String variavelLocal;

        nao compila

        System.out.println("valor da variavel local variavelLocal: " + variavelLocal);
    }*/

    public static void criarVariavelLocalComIf(){
        Random random = new Random();
        int numeroRandom = random.nextInt(100);
        int res = (numeroRandom / 2);
        System.out.println(res);

        String numero; //criando variavel local sem valor

        //Se for usado um if com uma variavel local sem ser iniciada com um valor
        //em qualquer rumo que a condicao if tomar, deve-se certificar que a variavel local vai ser inicializada
        //caso contrario nao sera compilado

        if(res % 2 == 0){
            numero = "par";
            System.out.println(numero);
        }else{
            numero = "impar";
            System.out.println(numero);
        }

    }
}
