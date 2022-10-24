package com.acessoarquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Gravadora {

    public static void gravarEstoque(String nomeArquivo, String caminho, List<String> conteudo){

        FileWriter stream;
        PrintWriter print;

        try{

            //stream é uma conexão de escrita para o arquivo
            stream = new FileWriter(caminho);
            //a classe PrintWriter escreverá no arquivo
            print = new PrintWriter(stream);

            for(String linha: conteudo){

                //o método println escreve uma linha no arquivo
                print.println(linha);
            }
            //close fecha o arquivo
            print.close();
            stream.close();

            System.out.printf("O arquivo %s foi salvo em %s com sucesso!", nomeArquivo, caminho);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
