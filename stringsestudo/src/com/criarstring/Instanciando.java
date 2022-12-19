package com.criarstring;

public class Instanciando {

    public static void main(String[] args) {

        String nome; /*Declarando uma variavel do tipo String */
        nome = new String(); /*Instanciando o objeto*/
        nome = "banana"; /*Atribuindo um valor ao objeto referenciado pela variavel de referencia, nome*/
        System.out.println(nome);

        String nome1 = new String("laranja");/*O primeiro trecho declara*/
        System.out.println(nome1);/*O segundo trecho instancia e inicializa ela atraves do construtor*/

        String nome2 = "Banana";/*feito somente a declaracao e inicializacao, esse objeto sera armazenado em um pool de memoria*/
        System.out.println(nome2);/*esse pool funciona como um cache. Isso ocorre pq nao foi usado o operador new*/
    }
}
