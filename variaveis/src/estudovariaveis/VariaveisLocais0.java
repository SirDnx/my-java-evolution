package estudovariaveis;

public class VariaveisLocais0 {

    public void m1(){
        //A variável x, é uma var local, foi definida dentro do método m1, só pode ser utilizada aqui dentro
        int x = 10;
        if(x >= 10){
            //a variável y só pode ser utilizada dentro do bloco if. Foi definida aqui dentro
            int y = 5;
            System.out.println(y);
        }
        System.out.println(x);
    }

    public void m2(){
        for(int i = 0, j = 0; i < 10; i++){
            //tanto a variável "i" quanto a "j" só podem ser acessadas dentro do escopo do laço for
            System.out.println(j++);
        }
    }

    public void m3(String nome){
        //O parâmetro nome, também é uma variável local. Só pode ser acessada aqui dentro
        //O mesmo é válido para construtores
        System.out.println(nome);
    }
}



