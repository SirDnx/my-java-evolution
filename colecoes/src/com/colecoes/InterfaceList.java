package com.colecoes;

import java.util.ArrayList;
import java.util.List;

public class InterfaceList {
    public static void main(String[] args) {

        List<String> carrinhos = new ArrayList<String>();

        System.out.println("\nO carrinho está vazio: " + carrinhos.isEmpty() + "\n");

        carrinhos.add("Morango");
        carrinhos.add("Maçã");
        carrinhos.add("Maçã");
        carrinhos.add("Pera");
        carrinhos.add("Maçã");
        carrinhos.set(1, "Pera");

        System.out.println("\nFrutas adicionadas no carrinho\n");

        System.out.println("\nO carrinho está vazio: " + carrinhos.isEmpty() + "\n");
        System.out.println("\nTamanho do carrinho: " + carrinhos.size() + "\n");
        System.out.println("\nTem maçã no carrinho: " + carrinhos.contains("Maçã") + "\n");
        System.out.println("\nOnde está a primeira maçã no carrinho: " + carrinhos.indexOf("Maçã") + "\n");
        System.out.println("\nOnde está a última maçã no carrinho: " + carrinhos.lastIndexOf("Maçã") + "\n");

        for(String carrinho:carrinhos){
            System.out.println(carrinho);
        }
    }
}
