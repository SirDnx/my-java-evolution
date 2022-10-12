package com.loopfor;

public class LoopFor {

    public static void main(String[] args) {

        Carneirinho c = new Carneirinho();

        c.setVoltas(10);
        c.contar();
    }
}

class Carneirinho{

    private int carneiro = 0;
    private int numero;

    public void setVoltas(int numero){
        this.numero = numero;
    }

    public void contar(){

            for(; carneiro <= numero; carneiro++ ){
            System.out.println("Carneirinho - " + carneiro);
        }
    }
}
