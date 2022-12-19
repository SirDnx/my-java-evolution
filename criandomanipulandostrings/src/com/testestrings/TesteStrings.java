package com.testestrings;

public class TesteStrings {

    public static void main(String... args) {

        //gerando string diretamente, vai para um pool de strings
        String nomeDireto = "Java";
        //gerando uma string com operador new, possui um endereçamento diferente, é um objeto diferente do anterior
        //por mais que seu conteúdo seja idêntico
        String nomeIndireto = new String("Java");

        //criado um array de char
        char[] nomeChar = new char[]{'J', 'a', 'v', 'a'};
        //criado uma string a partir do array de char
        String nomeString = new String(nomeChar);

        //Criando um StringBuilder com valor Java
        StringBuilder sb = new StringBuilder("Java");
        //Instanciando um tipo String passando o dado tipo StringBuilder como parâmetro
        String nomeStringBuilder = new String(sb);

        //essa string possui valor nulo
        //se tentar acessar algum método de um objeto nulo, será lançada a exceção NullPointerException
        String valorNulo = null;
        //System.out.println(valorNulo.length());

        //Ao concatenar um objeto com valor nulo, o Java faz a conversão do valor para String
        //O mesmo ocorre ao concatenar com números de tipo primitivo qualquer
        String fraseComStringNula = "Frase com valor" + " " + valorNulo;
        System.out.println(fraseComStringNula);

        //Ao concatenar strings e valores, deve-se pensar na precedência de operadores
        System.out.println("Tudo que vem depois da string é convertido em string: " + 2 + 0 + 2 + 2);
        System.out.println(2 + 0 + 2 + 2 + " Agora ao contrário dá problema, é somado.");

        //A string é imutável e não pode ter seu valor alterado após sua criação
        nomeDireto.toUpperCase();
        //A string original continua com letras em minúsculas
        System.out.println(nomeDireto);
        //A variável de referência nomeDireto aponta pra um objeto na memória, ao chamar o método toUpperCase
        //é criado outro objeto com caracteres em maiúsculas, porém é perdido pois não está sendo salvo
        //em nenhuma variável
        nomeDireto = nomeDireto.toUpperCase();
        System.out.println(nomeDireto);

        //As classes StringBuilder e StringBuffer permitem trabalhar com strings mutáveis
        //A diferença é que Sbuilder é mais nova e SBuffer é thread safe
        //SBuilder é mais utilizada

        //String usa um array em seu funcionamento, os caracteres possuem índices. Começa pelo índice 0
        //Ao tentar acessar um índice menor que zero ou maior que a string, será lançada a exceção StringIndexOutOfBoundsException
        System.out.println(nomeIndireto);
        System.out.println(nomeIndireto.charAt(0));

        //alguns métodos:

        //retorna o tamanho da string
        System.out.println(nomeString.length());
        //retorna true ou false. Se a string length é maior ou igual a zero
        System.out.println(nomeString.isEmpty());
        //transforma os caracteres para maiúsculas
        System.out.println(nomeString.toUpperCase());
        //transforma as letras em minúsculas
        System.out.println(nomeString.toLowerCase());

        //remove os espaços em branco a esquerda e a direita
        String nomeComEspacos = new String("   Java   ");
        System.out.println(nomeComEspacos.trim());

        //recebe o índice inicial e final, ou apenas inicial, que irá criar uma nova string a partir do intervalo fornecido
        //o caractere do índice final não é impresso
        //ao tentar informar um índice inexistente, é lançada a exceção StringIndexOutOfBoundsException
        System.out.println(nomeString.substring(1,3));

        //adiciona uma string a outra, retornando uma nova string
        String novaString = nomeIndireto.concat(" ").concat(nomeDireto);
        System.out.println(novaString);

        //recebe um char existente na string e troca ele pelo novo char informado, retornando uma nova string
        String novaString1 = nomeIndireto.replace('J', 'X');
        System.out.println(novaString1);

        //recebe um CharSequence alvo e um novo CharSequence que irá substituir o anterior na string
        //Também funciona para SBuilder e para SBuffer
        String novaString2 = nomeIndireto.replace("va", "vali");
        System.out.println(novaString2);

        //Compara o valor armazenado (é CaseSensitive) e retorna boolean
        //herdado de Object
        boolean igual = nomeIndireto.equals(nomeDireto);
        System.out.println(igual);

        //Compara o valor armazenado ignorando diferença de maiúsculas e minúsculas
        boolean igual1 = nomeIndireto.equalsIgnoreCase(nomeDireto);
        System.out.println(igual1);

        //compara se uma String aparece antes ou depois do que outra lexicograficamente
        //retorna um valor positivo se a String passada vier depois da que está sendo comparada, 0 se forem iguais, número negativo se vier antes.
        //vem de Comparable
        int igualLexicograficamente = nomeDireto.compareTo(nomeIndireto);
        System.out.println(igualLexicograficamente);

        //Faz o mesmo que o anterior, porém ignora diferença de maiúsculas e minúsculas
        //Lexicograficamente as maiúsculas vêm antes das minúsculas
        int igualLexicograficamente1 = nomeDireto.compareToIgnoreCase(nomeIndireto);
        System.out.println(igualLexicograficamente1);

        //retorna o índice inicial da primeira aparição da string informada no parâmetro
        //caso a palavra procurada não existe, é retornado um número negativo
        String texto = "Exemplo do método indexOf";
        System.out.println(texto.indexOf("método"));

        //retorna boolean se a string tiver a sequência de chars passado no parâmetro
        boolean contem = texto.contains("do");
        System.out.println(contem);

        //faz a mesma pesquisa, porém de trás pra frente. Retorna o índice da última ocorrência
        System.out.println(texto.lastIndexOf("e"));

        //informando um índice pra pesquisa ser feita a partir dele
        System.out.println(texto.indexOf("e", 3));

        //retorna boolean, se a string começa ou não com o valor informado
        System.out.println(texto.startsWith("Exen"));

        //retorna boolean, se a string termina ou não com o valor informado
        System.out.println(texto.endsWith("Of"));

    }

}
