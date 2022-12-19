package estudovariaveis;

public class VariavelEstatica {

    //Uma variável estática é única para toda a classe, pra todos os objetos da classe.
    //Se houvesse 5 objetos pessoa, todos teriam o único id, que é estático.
    //variáveis estáticas podem ser acessadas através de qualquer escopo.
    //Não é necessário existir um objeto pra se acessar seu atributo estático
    //porém deve-se levar em conta os modificadores de acesso.
    public static void main(String... args) {
        System.out.println(Pessoa.id);

        //Uma variável de classe estática, pode ser acessada por um método estático
        Pessoa.m1();
    }

}

class Pessoa{
    static int id = 5;

    public static void m1(){
        System.out.println(id);
    }

}