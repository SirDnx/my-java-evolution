package com.acessoarquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leitora {

    public static void lerEstoque(String caminho) {

        try {
            //Abre o arquivo
            FileReader stream = new FileReader(caminho);

            //BufferedReader possui o método readLine()
            //lê uma linha do arquivo e retorna uma String com o valor lido ou null
            BufferedReader reader = new BufferedReader(stream);

            //Lê uma linha do arquivo
            String linha = reader.readLine();

            //enquanto linha != null
            while(linha != null) {

                System.out.println(linha);
                //lê a próxima linha do arquivo
                linha = reader.readLine();
            }

            reader.close();
            //fecha o arquivo
            stream.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não foi encontrado!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
