package com.exceptionexfiap;

public class TestException {

    public static void gerarExcecao(){
        try{

            //trecho onde o erro pode ocorrer

            int val = 10 / 0;

            int [] valores = new int [3];
            System.out.println(valores[4]);

            String nome = null;
            System.out.println(nome.length());

            int numero = Integer.parseInt("zero");

        }catch(ArithmeticException e){    //captura a exceção

            System.out.println("Não é possível realizar uma divisão por zero");

            //Mensagem com a lista de erros:

            System.out.println(e.getMessage());


            //Imprime a pilha de erros da exceção
            e.printStackTrace();

        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Posição informada, não existe no array");

        }catch(NullPointerException e){

            System.out.println("Não é possível acessar os métodos de um objeto nulo");

        }catch(NumberFormatException e){

            System.out.println("Não é possível transformar uma palavra em um número");

        }catch(Exception e){

            System.out.println("Erro na execução do programa");

        }finally {

            System.out.println("Sempre será executado");
        }
    }
}
