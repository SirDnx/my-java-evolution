package classes.estudos;

class Carro{
    // classe que sera usada como tipo de referencia
}

public class ClasseAtributosComValoresPadrao {

    //todos os tipos compativeis com numero, tem valor default 0

    private int idade; //valor default 0
    private double salario; //valor default 0.0
    private char sexo; //possui valor padrao em branco, equivalente a 0
    private Carro carro; //valor padrao null
    private String nome; //tipo de classe, valor padrao null
    private boolean ativo; //valor padrao false

    private int[] novo_array = new int[5]; //possui valor padrao de acordo com o tipo que foi definido, as cem posicoes
    //nesse caso, serao iguais a 0


    public int[] getNovo_array() {
        for(int numero: novo_array){
            System.out.println(numero);
        }
        return null;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public char getSexo() {
        return sexo;
    }

    public Carro getCarro() {
        return carro;
    }

    public String getNome() {
        return nome;
    }
}
