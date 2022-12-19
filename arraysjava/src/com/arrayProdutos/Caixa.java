package com.arrayProdutos;

public class Caixa {

    public static void main(String[] args) {

        Produtos [] produto = new Produtos[2];

        Produtos produto1 = new Produtos();
        produto1.setDescricao("Limpeza");
        produto1.setNome("Sabão em pó 200g");
        produto1.setValor(5.99);

        Produtos produto2 = new Produtos();
        produto2.setDescricao("Alimentação");
        produto2.setNome("Bolacha Cream Cracker");
        produto2.setValor(6.5);

        produto[0] = produto1;
        produto[1] = produto2;

        for(int i = 0; i < produto.length; i++){
            System.out.println(produto[i].toString());
        }

        Produtos [][] localizacaoProdutos = new Produtos[2][3];
        localizacaoProdutos[0][1] = produto1;
        localizacaoProdutos[0][2] = produto2;

        System.out.println(localizacaoProdutos[0][2].getNome());
    }
}
