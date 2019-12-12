package br.edu.senai.controle;
//
//import java.io.IOException;
//
//import br.edu.senai.modelo.ManipuladorArquivo;
//
//public class Main {
// 
//    public static void main(String args[]) throws IOException {
//        String path = "C:/Users/Senai/Documents/Jean/ControleFinanceiro/file.txt";
// 
//        ManipuladorArquivo.leitor(path);
//        ManipuladorArquivo.escritor(path);
//        ManipuladorArquivo.leitor(path);
//    }
// 
//}

import java.io.IOException;
import java.util.Scanner;

import br.edu.senai.modelo.EntradaESaida;
import br.edu.senai.modelo.ManipulaGasto;
import br.edu.senai.modelo.ManipulaReceita;
import br.edu.senai.modelo.ManipulaSaldo;

// criar um projeto onde será passado o valor em caixa, o valor adicionado, o valor retirado e retornar o total instantâneo. 


public class Main {

  public static void main(String[] args) throws IOException { //Arquivo SCV e teste 2
	//public static void main(String args[]) throws IOException { // Arquivo TXT 1

	  System.out.println("Bem vindo a planilha de gastos");
	  Scanner entrada = new Scanner(System.in);
	  
	  
	  // Criar acesso aos metodos das classes
	  EntradaESaida lerArquivo = new EntradaESaida();
	  ManipulaGasto novoGasto = new ManipulaGasto(entrada);
	  ManipulaReceita novaReceita = new ManipulaReceita(entrada);
	  ManipulaSaldo manpSaldo = new ManipulaSaldo();
	  
	 
	  
	// carregar o banco de dados // criar um get leitura de arquivo 
	  String path = "C:/Users/Senai/Documents/Jean/ControleFinanceiro/file.txt";
	  	  lerArquivo.ler(manpSaldo);
	  
	  // perguntar oq ele quer fazer 
	  
	  
	  
	  while(true)
	  {
		  System.out.println("Informe oque você deseja fazer: \n\tS - Para retornar valor de saldo \n\tG - Para adicionar novo gasto \n\tR - para adicionar um novo rendimento \n\tQ - Para encerrar o programa");
		  
		  
		  String simbolo = entrada.next();
		  if (simbolo.equals("S")|| simbolo.equals("s"))
		  {
			  // rotina para buscar saldo disponivel
			  manpSaldo.buscaSaldo();
			  
		  }
		  
		  else if (simbolo.equals("G")|| simbolo.equals("g"))
		  {
			  // chama a rotina para um novo gasto
			  
			  novoGasto.adicionaGasto();
			  lerArquivo.escrever(50);
		  }
		  
		  else if (simbolo.equals("R")|| simbolo.equals("r"))
		  {
			  // rotina para uma nova receita
			  
			  novaReceita.adicionaReceita();
		  }
		  
		  else if (simbolo.equals("Q")|| simbolo.equals("q"))
		  {
			  break;
		  }
	  }	  
  }
}

  