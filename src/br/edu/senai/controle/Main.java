package br.edu.senai.controle;

import java.io.IOException;
import java.util.Scanner;

import br.edu.senai.modelo.EntradaESaida;
import br.edu.senai.modelo.ManipulaGasto;
import br.edu.senai.modelo.ManipulaReceita;
import br.edu.senai.modelo.ManipulaSaldo;

// criar um projeto onde será passado o valor em caixa, o valor adicionado, o valor retirado e retornar o total instantâneo. 

public class Main {

  public static void main(String[] args) throws IOException { 

	  
	  // Informar o caminho para o arquivo de banco de dados
	  String endereco = "C:\\Users\\Public\\ControleFinanceiro.txt";
	  String ID = "";
	  String origem = "";
	  double valor = 0;
	  
	  System.out.println("Bem vindo a planilha de gastos");
	  Scanner entrada = new Scanner(System.in);

	  // Criar acesso aos metodos das classes
	  EntradaESaida arquivo = new EntradaESaida();
	  ManipulaSaldo manpSaldo = new ManipulaSaldo();
	  ManipulaGasto gasto = new ManipulaGasto(entrada , manpSaldo);
	  ManipulaReceita novaReceita = new ManipulaReceita(entrada);
 
	  // carregar o banco de dados // criar um get leitura de arquivo 
	  arquivo.ler(ID, valor, origem, manpSaldo , endereco, false);

	  while(true)
	  {
		// perguntar o que o usuário deseja fazer 
		  System.out.println("Informe o que você deseja fazer: \n\t" +
				  "S - Para visualizar o seu saldo \n\t" +
				  "G - Para adicionar novo gasto \n\t" +
				  "R - Para adicionar um novo rendimento \n\t" +
				  "L - Para listar os gastos \n\t" +
				  "Q - Para encerrar o programa ");
		  
		  
		  String simbolo = entrada.next().toUpperCase();
		  if (simbolo.equals("S"))
		  {
			  // rotina para buscar saldo disponivel
			  manpSaldo.buscaSaldo();
			  
		  }
		  
		  else if (simbolo.equals("G"))
		  {
			  // chama a rotina para um novo gasto 
			  gasto.adicionaGasto(manpSaldo, arquivo, endereco);
		  }
		  
		  else if (simbolo.equals("R"))
		  {
			  // rotina para uma nova receita
			  novaReceita.adicionaReceita(manpSaldo, arquivo, endereco);
		  }
		  
		  else if (simbolo.equals("L"))
		  {
			// chama a rotina para listar gastos 
			  gasto.listaGasto(manpSaldo, arquivo, endereco);
		  }
		  
		  else if (simbolo.equals("Q"))
		  {
			  break;
		  }
		  
		  else {
			  System.out.println("\tComando Inválido\n");
		  }
	  }	  
  }
}

  
