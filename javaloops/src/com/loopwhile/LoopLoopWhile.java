package com.loopwhile;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class LoopLoopWhile {

    public void comprarDoces() {

        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.printf("Doce do valor R$ %,.2f adicionado no carrinho.\n", valorDoce);
            mesada = mesada - valorDoce;
        }

        System.out.printf("Mesada R$ %,.2f. Joãozinho gastou toda a sua mesada em doces!\n", mesada);
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}

class ExemploDoWhile {

    public void tocar() {
        System.out.println("Discando...");

        do {
            //excutando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");

        } while (tocando());

        System.out.println("Alô !!!");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;
    }
}

class Exemplo{

    public static void main(String[] args) {
        LoopLoopWhile ex = new LoopLoopWhile();
            ex.comprarDoces();

    }
}


