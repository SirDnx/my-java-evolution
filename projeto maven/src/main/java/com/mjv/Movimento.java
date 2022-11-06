package com.mjv;

import com.Enums.TipoMovimento;

import java.time.LocalDateTime;

public class Movimento {

    private LocalDateTime dataHora;
    private String descricao;
    private Double valor;
    private TipoMovimento tipo;

    public Movimento(LocalDateTime dataHora, String descricao, Double valor, TipoMovimento tipo){
        this.dataHora = dataHora;
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public TipoMovimento getTipo() {
        return tipo;
    }
}
