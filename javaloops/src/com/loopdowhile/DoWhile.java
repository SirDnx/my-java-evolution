package com.loopdowhile;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        CalculadoraSoma  c = new  CalculadoraSoma();
        c.somar();
    }
}

class CalculadoraSoma{

    int n1;
    int n2;

    public void somar() {

        boolean resposta = true;

        do {

            Scanner entrada = new Scanner(System.in);

            System.out.print("\nDigite o primeiro múmero inteiro: ");
            n1 = entrada.nextInt();

            System.out.print("\nDigite o segundo número inteiro: ");
            n2 = entrada.nextInt();

            System.out.print("\nDigite [1] para somar novamente: ");
            int res = entrada.nextInt();

            entrada = null;

            if(res == 1){
                resposta = true;
            }else{
                resposta = false;
            }

            int r = n1 + n2;

            System.out.printf("\nO resultado da soma de %d + %d é %d.\n", n1, n2, r);
            System.out.println("----------------------------------------------------");

        } while (resposta == true);

    }
}
