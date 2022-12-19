package classes.estudos;

public class ClasseSeparandoDigitosComUnderline {

    //A partir do Java 7, pode-se adicionar "_" para separar os valores numericos, para melhorar a compreensao.
    //Se adicionar underline antes ou depois do valor, o Java nao compila. Pode adicionar underline entre dois valores
    //ou entre underlines. Nas outras bases pode-se adicionar "_" entre os numeros e entre as letras do valor hexadecimal
    //tambem, ja que essas letras representam o valor em si.
    private long x = 1_234_567_891_234l;

    public long getX() {
        return x;
    }
}
