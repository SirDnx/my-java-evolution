package com.acessoarquivos;

import java.io.File;
import java.util.List;
import java.util.ArrayList;

import static com.acessoarquivos.Gravadora.gravarEstoque;
import static com.acessoarquivos.Leitora.lerEstoque;

public class TesteArquivo {

    public static void main(String[] args) {

        /*String nomeArquivo = "estoque.csv";
        String diretorio = System.getProperty("user.home");
        String caminho = diretorio + "\\" + nomeArquivo;

        List<String> conteudo = new ArrayList<>();

        conteudo.add("\nProduto; Quantidade; Unidade de medida; Valor da unidade;");
        conteudo.add("Pera; 200; pct; R$ 5,40;");
        conteudo.add("Morango; 400; cx; R$ 6,50;");
        conteudo.add("Abacaxi; 280; un; R$ 5,00;");

        gravarEstoque(nomeArquivo, caminho, conteudo);

        lerEstoque(caminho);*/

        File arquivo = new File(MetodosFile.getDiretorio());
        MetodosFile.informarArquivo(arquivo);
    }
}