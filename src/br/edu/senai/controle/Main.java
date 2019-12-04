package br.edu.senai.controle;

import java.io.IOException;

import br.edu.senai.modelo.ManipuladorArquivo;

public class Main {
 
    public static void main(String args[]) throws IOException {
        String path = "C:/Users/Senai/Documents/Jean/ControleFinanceiro/file.SCV";
 
        ManipuladorArquivo.leitor(path);
        ManipuladorArquivo.escritor(path);
        ManipuladorArquivo.leitor(path);
    }
 
}


