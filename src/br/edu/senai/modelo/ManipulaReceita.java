package br.edu.senai.modelo;

import java.io.IOException;
import java.util.Scanner;

public class ManipulaReceita extends Manipula  {

	private Scanner entrada;

	// Cria construtor vazio
	public ManipulaReceita(Scanner entrada) {
		super();
		this.entrada = entrada;
	}

	//Construtor com campos
	public ManipulaReceita(String origem, double valor, Scanner entrada) {
		super(origem, valor);
		this.entrada = entrada;
	}
	
	public void adicionaReceita(ManipulaSaldo manpSaldo, EntradaESaida arquivo, String endereco) throws IOException {
		System.out.println("Informe o valor que você deseja adicionar como receita: ");
		this.valor = entrada.nextDouble();
		
		System.out.println("Informe a origem da receita: ");
		this.origem = entrada.next().toUpperCase();
		
		// Cria um identificador de gasto
		String ID = "Receita"; 
		
		// cria variavel e atribui o valor do saldo disponível 
		double saldo = manpSaldo.getValor();
		
		// calcula o novo valor de saldo
		saldo = saldo + valor;
		
		// salva no banco de dados as novas informações 
		arquivo.escrever(ID, valor, origem, saldo, endereco);
		
		// carrega dados para o sistema após atualização
		arquivo.ler(ID, valor, origem, manpSaldo, endereco, false);
		
		// retorna alguma mensagem informando q foi executado o comando
		System.out.println("\n\tDados adicionados com sucesso!");
		System.out.println("\n\tSeu saldo atual é de: " + saldo + "\n");
	}
	
	
}

