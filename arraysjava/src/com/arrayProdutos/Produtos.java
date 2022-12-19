package com.arrayProdutos;

public class Produtos {

    String nome;
    String descricao;
    Double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString(){
        return String.format("Produto: %s \nDescrição: %s \nValor: %,.2f\n\n", nome, descricao, valor);
    }
}
