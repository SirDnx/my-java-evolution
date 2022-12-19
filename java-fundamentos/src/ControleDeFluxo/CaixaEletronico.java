package ControleDeFluxo;

public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 15.53;

        if (valorSolicitado <= saldo) {
            saldo -= valorSolicitado;
            System.out.println(saldo);
        } else {
            System.out.println("Valor solicitado e superior ao saldo");
        }
    }
}
