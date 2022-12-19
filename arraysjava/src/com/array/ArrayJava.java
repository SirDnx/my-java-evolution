package com.array;

public class ArrayJava {

    public static void main(String[] args) {


        String nomes [] = {"José", "Marcos", "Waldomiro", "Vinicius"};
        Double salarios [] = {1250.5, 2360.4, 5645.0, 4365.5};
        int x = 0;

        for(; x < nomes.length ; x++){
                System.out.printf("O funcionário %s recebe R$ %,.2f\n", nomes[x], salarios[x]);
        }
    }
}

