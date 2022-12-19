package com.exceptionexfiap;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PropagandoException {

    /*pode ocorrer a exception de não existir o arquivo, no caminho indicado.
    sendo propagada a exceção através do throws.
    */

    public static void testarDiretorioException() throws IOException {

        FileWriter fw = new FileWriter("c:\\nota.txt");

        PrintWriter print = new PrintWriter(fw);

        print.println("Maçã: R$ 4,00");
        print.println("Morando: R$ 6,50");
        print.println("Total: R$ 10,50");
        print.close();
        fw.close();
    }

}
