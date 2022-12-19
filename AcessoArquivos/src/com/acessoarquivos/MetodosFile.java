package com.acessoarquivos;

import java.io.File;
import java.io.IOException;

public class MetodosFile {

    private static String diretorio = "C:\\Users\\PC Gamer\\Downloads\\EstudosJava";

    public static String getDiretorio(){
        return diretorio;
    }

    public static void informarArquivo(File arquivo) {

        if (arquivo.exists()) {
            System.out.printf("""
                    O arquivo existe!
                    Pode ser lido: %b.
                    Pode ser gravado: %b.
                    Tamanho: %d
                    Caminho: %s""", arquivo.canRead(), arquivo.canWrite(), arquivo.length(), arquivo.getPath());
        } else {

            //cria o arquivo

            try {

                if (arquivo.createNewFile()) {
                    System.out.println("Arquivo criado!");
                } else {
                    System.out.println("Arquivo não criado!");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File fd = new File(diretorio);

        if (fd.exists()) {
            System.out.println("\nDiretório existe!");
        } else if (fd.mkdir()) {
            System.out.println("\nDiretório foi criado!");
        } else {
            System.out.println("\nDiretório não foi criado!");
        }
    }
}
