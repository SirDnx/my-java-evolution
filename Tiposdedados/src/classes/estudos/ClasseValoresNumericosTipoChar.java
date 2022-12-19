package classes.estudos;

public class ClasseValoresNumericosTipoChar {

    //Na tabela unicode, o numero nao tem equivalencia com a letra. A letra "C" e maior que a letra "A". As maiusculas maiores
    //que as minusculas.

    private char letraA = 65;
    private char letraB = 66;

    //tambem e possivel inicializar um caractere atraves do codigo unicode do caractere
    //Imprime o simbolo omega
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
