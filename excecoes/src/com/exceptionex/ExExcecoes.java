package com.exceptionex;

public class ExExcecoes {

    public static void main(String[] args) throws ExcecaoValorInvalido, ValorInsuficiente {

        SacarDepositar sd = new SacarDepositar();
        sd.depositar(-50);
        System.out.println(sd.recuperarSaldo());
        sd.sacar(50);
        System.out.println(sd.recuperarSaldo());

    }
}

class SacarDepositar{

    private double saldo = 0;

    public void depositar(double valor) throws ExcecaoValorInvalido{

        try {
            if (valor <= 0)
                throw new ExcecaoValorInvalido(valor);

            this.saldo += valor;

        }catch(ExcecaoValorInvalido e){
            System.out.println(e);
        }

    }

    public void sacar(double valor) throws ValorInsuficiente{

        try {
            if (valor > saldo)
                throw new ValorInsuficiente(valor);

            this.saldo -= valor;

        }catch(ValorInsuficiente e){
            System.out.println(e);
        }
    }

    public String recuperarSaldo(){

        StringBuilder mensagem = new StringBuilder();

        mensagem.append("O saldo da sua conta é: R$ ");
        mensagem.append(this.saldo);

        return mensagem.toString();
    }
}
