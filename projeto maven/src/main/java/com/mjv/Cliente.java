package com.mjv;

import java.util.Date;

public class Cliente {

    private String nome;
    private String cpf;
    private Date dataNascimento;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }

}
