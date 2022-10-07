package fundamentos.powerclasses;

public class NegativeNumber {
    public static void main(String[] args){

        int numero = 5;
        System.out.println(-numero);
        numero = -numero;
        System.out.println(numero);

        boolean nao = false;
        String mensagem = nao?"imprima sim!":"imprima não!";
        System.out.println(mensagem);

        int nota = 7;
        String resultado = nota >=7 ? "Aprovado!":"Reprovado";
        System.out.println(resultado);

        String teste = 1==2 ? "1 é igual a 2":"1 é diferente de 2";
        System.out.println(teste);

        Carro c1 = new Carro();
        System.out.println(c1.getNome());
    }
}

class Carro{
    int chassi = 123;
    String nome = "Gol";

    String getNome(){
        return nome;
    }
}
