package fundamentos.powerclasses;

import java.util.Arrays;

public class StringSample {
	
    public static void main(String[] args) {
    	
    	
        /**
         * A classe String e utilizada para representar conteudos alfanumericos, exemplo:
         * JOSE, maria, NIJ-3323, 123@master
         *
         * Link documentacao oficial oracle versao 18
         * https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/String.html
         */
    	
        //metodoConcat();
        //metodoContains();
        //metodoIsBlank();
        //metodoLowerUpperCase();
    	//metodoEquals();
    	//metodoEndsStartsWith();
    	//metodoCharAt();
    	//metodoReplace();
    	//metodoSplit();
    	metodoSubstring();
    	
        //dinamica do emissor de cheque valor extenso
        //Exibir o valor cheque por extenso em 50 caracteres completados por *
        //Exemplo: Um mil e duzentos reais ***************** -
    }
    
    static void metodoLowerUpperCase(){
    	
        /** metodos que tornam as palavras  minusculas e maiúsculas respectivamente*/
        String nome = "JOSE";
        String nomeMinusculo = nome.toLowerCase();
        System.out.println(nomeMinusculo);

        String deNovoMaiusculo = nomeMinusculo.toUpperCase();
        System.out.println(deNovoMaiusculo);
    }
    
    static void metodoConcat(){
    	
        /** O metodo concat realiza a juncao entre dois alfanumericos, o retorno
         * deste metodo e uma nova String*/

        String nome = "JOSE";
        String sobrenome = "ROBERTO";
        //JOSE ROBERTO
        String nomeCompleto = nome.concat( " ").concat(sobrenome);
        System.out.println(nomeCompleto);
        //Banana, a melhor fruta do mundo!
        String nome2 = new String("Banana");
        String descricao = new String("a melhor fruta do mundo!");
        String propaganda = nome2.concat(", ").concat(descricao);
        System.out.println(propaganda);
        
    }
    
    static void metodoContains(){
        /** O metodo contains analisa se existe o texto passado como parametro
         * em uma determinada variavel do tipo String retorna um valor boolean
         * verdadeiro ou falso*/

        String nome = "Banana prata";
        String palavra = "prata";
        Boolean resposta = nome.contains(palavra);//ver aplicabilidade de usar classes Wrappers (toString)

        System.out.println("O nome ".concat(nome).concat(" contains a palavra ")
                        .concat(palavra).concat("?\nResposta: ").concat( resposta.toString() ));

    }
    
    static void metodoIsBlank(){
        /** Retorna true se a string estiver vazia ou contiver apenas
         codepoints de espaco em branco, caso contrario, false.
         * metodo disponivel desde a versao 11
         * */

        String palavra= "";

        boolean vazia = palavra.trim().length() == 0;
        System.out.println("antes do java 11: A palavra esta vazia? " + vazia);

        boolean vazia1 = palavra.isBlank();
        System.out.println("A partir do java 11: A palavra esta vazia? " + vazia1);

        //vamos ver a diferenca entre isBlank versus isEmpty
        //https://howtodoinjava.com/java11/check-blank-string/#:~:text=isBlank()%20vs%20isEmpty(),not%20check%20the%20string%20length.

    }
    
    static void metodoEquals(){

        String nome = new String("Banana");
        String nome1 = new String("banana");
        String nome3 = "Banana";
        String nome4 = "coco ralado";
        
        //compara se é igual ou nao, levando em consideracao maiusculas e minusculas
        Boolean igualSensitiveCase = nome.equals(nome1); 
        System.out.println("O nome ".concat(nome).concat(" é igual ao nome ".concat(nome1).concat(" considerando o Case Sensitive? ")
        		.concat("\nResposta:")
        		.concat(igualSensitiveCase.toString())));
        
      //compara se é igual ou nao, NAO levando em consideracao maiusculas e minusculas
        Boolean igualIgnoreCase = nome.equalsIgnoreCase(nome1);
        System.out.println("O nome ".concat(nome).concat(" é igual ao nome ".concat(nome1).concat(" desconsiderando o Case Sensitive? ")
        		.concat("\nResposta:")
        		.concat(igualIgnoreCase.toString())));
       
        Boolean igualSensitiveCase1 = nome.equals(nome3);
        System.out.println("O nome ".concat(nome).concat(" é igual ao nome ".concat(nome3).concat(" considerando o Case Sensitive? ")
        		.concat("\nResposta:")
        		.concat(igualSensitiveCase1.toString())));
        
      //compara se é igual ou nao, levando em consideracao o endereco de armazenamento na memoria
        Boolean igualEnderecoMemoria = nome3 == nome4;
        System.out.println("O nome ".concat(nome3).concat(" é igual ao nome ".concat(nome4).concat(" considerando o endereco dos objetos na memoria? ")
        		.concat("\nResposta:")
        		.concat(igualEnderecoMemoria.toString())));
        
    }
    
    static void metodoEndsStartsWith() {
    	  
    	String descricao = "Frase de exemplo para o teste do metodo StartsWith, EndsWith";
    	String frase = "Frase";
    	String letra = "h";
    	
        Boolean comecaCom = descricao.startsWith(frase);
        Boolean terminaCom = descricao.endsWith(letra);
        
        System.out.println("A frase: ".concat(descricao).concat( ",comeca com: ").concat(frase).concat("?\nResposta: ").concat(comecaCom.toString()));
        System.out.println("A frase: ".concat(descricao).concat( ",termina com: ").concat(letra).concat("?\nResposta: ").concat(terminaCom.toString()));
    }
    
    static void metodoCharAt(){ 	
    	String descricao = "Frase de exemplo para o teste do metodo charAt";
    	
    	//retorna o caractere na posicao do indice informado. O indice comeca em 0, ja que uma string nada mais e que um
    	//array de char
    	
    	System.out.println("Caractere no indice 1: " 
    	+ descricao.charAt(1));
    	
    	System.out.println("Primeira ocorrencia do caractere \"Z\" com o metodo indexOf: "
    	+ descricao.indexOf("z"));/*retorna -1 pq a string passada nao tem o caractere z*/
    	
    	System.out.println("Ultima ocorrencia da palavra \"teste\" com o metodo lastIndexOf: "
    	+ descricao.lastIndexOf("teste"));
    }
    
    
    static void metodoReplace(){
        String descricao = "Frase de exemplo para o teste do metodo replace";
        
        //esse metodo retorna uma nova string removendo as ocorrencias do primeiro caractere passado,
        //substituindo-os pelo segundo
        String descricaoEditada = descricao.replace(" ", ";");
  
        System.out.println("Frase original: ".concat(descricao).concat(".\nFrase após uso do método replace: ").concat(descricaoEditada));
    }
    
    static void metodoSplit(){
        String descricao = "Frase;de;exemplo;para;o;teste;do;metodo;split";
        
        //vai criar um array com os valores separados, de acordo com a marcacao passada pro metodo.
        
        System.out.println(Arrays.toString(descricao.split(";")));

    }
    
    static void metodoSubstring(){
        String descricao = "Frase de exemplo para o teste do metodo substring";
        
        System.out.println(descricao.substring(0,10));/*vai criar uma nova string do indice 0 ao 10*/
        System.out.println(descricao.substring(10));/*vai criar uma nova string do indice 10 ao fim*/
    }

}
