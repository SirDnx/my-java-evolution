package estudovariaveis;

public class VariaveisMesmoNome {

    //static int a;
    //Não é possível declarar duas variáveis de mesmo nome na mesma classe
    int a;

    public void m1(int a){
        //é permitido variáveis locais terem nome igual a variáveis de instância, como em um parâmetro
        //shadowing: capacidade de esconder o acesso a uma das variáveis
        //o operador this deixa explicito qual variável é a da classe
        this.a = a;
    }
}
