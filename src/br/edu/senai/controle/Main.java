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

import java.util.Scanner;

// criar um projeto onde será passado o valor em caixa, o valor adicionado, o valor retirado e retornar o total instantâneo. 


public class Main {

  public static void main(String[] args) {




//    Main obj = new Main();
//    obj.run();oiuytyutupoiouityyioy09


	  System.out.println("Bem vindo a planilha de gastos");
	  
	  // carregar o banco de dados // criar um get leitura de arquivo 
//	  Main obj = new Main();
//	  obj.run();
	  
	  // perguntar oq ele quer fazer 
	//  System.out.println("Informe oque vc deseja fazer: \n\tS - Para retornar valor de saldo \n\tG - Para adicionar novo gasto \n\tR - para adicionar um novo rendimento \n\tQ - Para encerrar o programa");
	  Scanner entrada = new Scanner(System.in);
	  
	  while(true)
	  {
		  System.out.println("Informe oque vc deseja fazer: \n\tS - Para retornar valor de saldo \n\tG - Para adicionar novo gasto \n\tR - para adicionar um novo rendimento \n\tQ - Para encerrar o programa");
		  
		  
		  String simbolo = entrada.next();
		  if (simbolo.equals("S")|| simbolo.equals("s"))
		  {
			  // rotina para buscar saldo disponivel
			  
		  }
		  
		  else if (simbolo.equals("G")|| simbolo.equals("g"))
		  {
			  // rotina para um novo gasto
		  }
		  
		  else if (simbolo.equals("R")|| simbolo.equals("r"))
		  {
			  // rotina para uma nova receita
		  }
		  
		  else if (simbolo.equals("Q")|| simbolo.equals("q"))
		  {
			  break;
		  }
	  }	  
  }
}

  