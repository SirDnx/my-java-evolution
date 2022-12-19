package estudovariaveis;

public class VariaveisInstancia {

    //São chamadas de atributo, variável membro, de objeto, de instância. Podem ser acessadas dentro do objeto.
    //Definidas dentro da classe, acessadas por construtores, métodos da classe, ou através da própria instância.
    String nome = "Java";
    //Uma variável de instância pode referenciar outra variável de instância
    String nomeCompleto = nome + " é muito legal!";

    public String m1(){
        return nome;
    }

    public void m2(){
        String novaVar = nome.toUpperCase();
        System.out.println(novaVar);
    }

    public String m3(){
        return nomeCompleto;
    }

    public static void main(String... args){
        VariaveisInstancia var = new VariaveisInstancia();
        var.m2();

        System.out.println(var.m3());
    }
}
