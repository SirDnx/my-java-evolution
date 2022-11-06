package classes.estudos;

public class ClasseValoresNumericosTipoChar {

    //Na tabela unicode, o número não tem equivalência com a letra. A letra "C" é maior que a letra "A". As maiúsculas maiores
    //que as minúsculas.

    private char letraA = 65;
    private char letraB = 66;

    //também é possível inicializar um caractere através do código unicode do caractere
    //Imprime o símbolo ômega
    private char omega = '\u03A9';

    public char getOmega() {
        return omega;
    }

    public char getLetraA() {
        return letraA;
    }

    public char getLetraB() {
        return letraB;
    }

    public static void imprimirAlfabeto() {
        for (int x = 65; x <= 90; x++) {
            char letra = (char) x;
            System.out.println(letra);
        }
    }

    public static void imprimirAlfabeto1(){
        for(char c='a';c <= 'z';c++) {
            System.out.println(c);
        }
    }

}
