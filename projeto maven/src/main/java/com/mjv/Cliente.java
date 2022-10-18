package com.mjv;

import java.util.Date;

public class Cliente {

    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String rg;

    public Cliente(String nome, String cpf, String rg){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome(){
        return this.nome;
    }

    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }

}
