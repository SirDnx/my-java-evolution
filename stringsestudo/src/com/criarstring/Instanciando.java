package com.criarstring;

public class Instanciando {

    public static void main(String[] args) {

        String nome; /*Declarando uma variável do tipo String */
        nome = new String(); /*Instanciando o objeto*/
        nome = "Maçã"; /*Atribuindo um valor ao objeto nome*/
        System.out.println(nome);

        String nome1 = new String("Laranja");/*O primeiro trecho declara*/
        System.out.println(nome1);/*O segundo trecho instancia e inicializa ela através do construtor*/

        String nome2 = "Banana";/*feito somente a declaração e inicialização, esse objeto será armazenado em um pool de memória*/
        System.out.println(nome2);/*esse pool funciona como um cache. Isso ocorre pq não foi usado o operador new*/
    }
}
