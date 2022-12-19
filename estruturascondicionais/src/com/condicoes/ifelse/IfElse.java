package com.condicoes.ifelse;

public class IfElse {

    public static void main(String[] args) {

        int idade = 75;

        if(idade < 16){
            System.out.println("nao pode votar!");
        }else if(idade < 18){
            System.out.println("Pode votar!");
        }else if(idade < 60){
            System.out.println("Deve votar!");
        }else{
            System.out.println("nao pode votar!");
        }
    }
}
