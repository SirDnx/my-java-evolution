package classes.estudos;

class Carro{
    // classe que será usada como tipo de referência
}

public class ClasseAtributosComValoresPadrao {

    //todos os tipos compatíveis com numéricos, tem valor default 0

    private int idade; //valor default 0
    private double salario; //valor default 0.0
    private char sexo; //possui valor padrão em branco, equivalente a 0
    private Carro carro; //valor padrão null
    private String nome; //tipo de classe, valor padrão null
    private boolean ativo; //valor padrão false

    private int[] novo_array = new int[5]; //possui valor padrão de acordo com o tipo que foi definido, as cem posições
    //nesse caso, serão iguais a 0


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
