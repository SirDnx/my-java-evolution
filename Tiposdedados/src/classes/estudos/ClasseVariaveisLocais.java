package classes.estudos;

import java.util.Random;

public class ClasseVariaveisLocais {

    //variáveis locais são as criadas dentro de construtures ou métodos
    //só podem ser acessadas dentro dos limites desses construtores ou métodos
    //uma variável local não possui valor padrão como os atributos de uma classe
    //ao ser criada deve ser atribuido um valor a ela, caso contrário não será compilado

    public static void criarVariavelLocal(){
        String variavelLocal = "esta é uma variável local de um método.";

        System.out.println("valor da variável local variavelLocal: " + variavelLocal);
    }

    /*public static void criarVariavelLocalSemValor(){
        String variavelLocal;

        Não compila

        System.out.println("valor da variável local variavelLocal: " + variavelLocal);
    }*/

    public static void criarVariavelLocalComIf(){
        Random random = new Random();
        int numeroRandom = random.nextInt(100);
        int res = (numeroRandom / 2);
        System.out.println(res);

        String numero; //criando variável local sem valor

        //Se for usado um if com uma variável local sem ser iniciada com um valor
        //em qualquer rumo que a condição if tomar, deve-se certificar que a variável local vai ser inicializada
        //caso contrário não será compilado

        if(res % 2 == 0){
            numero = "par";
            System.out.println(numero);
        }else{
            numero = "impar";
            System.out.println(numero);
        }

    }
}
