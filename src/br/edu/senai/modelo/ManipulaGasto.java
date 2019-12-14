package br.edu.senai.modelo;

import java.io.IOException;
import java.util.Scanner;

public class ManipulaGasto extends Manipula {

	private Scanner entrada;
	private ManipulaSaldo manpSaldo;

	// Criando construtor Vazio
	public ManipulaGasto(Scanner entrada, ManipulaSaldo manpSaldo) {
		super();
		this.entrada = entrada;
		this.manpSaldo = manpSaldo;
	}

	//Construtor com campos
	public ManipulaGasto(String origem, double valor, Scanner entrada , ManipulaSaldo saldo) {
		super(origem, valor);
		this.entrada = entrada;
		this.manpSaldo = manpSaldo;
	}

	public void adicionaGasto(ManipulaSaldo manpSaldo, EntradaESaida arquivo, String endereco) throws IOException {
		
		System.out.println("Informe o valor que você deseja adicionar como gasto: ");
		this.valor = entrada.nextDouble();
		
		System.out.println("Informe a origem do gasto: ");
		this.origem = entrada.next().toUpperCase();
		
		// Cria um identificador de gasto
		String ID = "Gasto"; 
				
		// cria variavel e atribui o valor do saldo disponível 
		double saldo = manpSaldo.getValor();
				
		// calcula o novo valor de saldo
		saldo = saldo - valor;
		
		// salva no banco de dados as novas informações 
		arquivo.escrever(ID, valor, origem, saldo, endereco);
		
		// carrega dados para o sistema após atualização
		arquivo.ler(ID, valor, origem, manpSaldo, endereco, false);
		
		// retorna alguma mensagem informando q foi executado o comando
		System.out.println("\n\tDados adicionados com sucesso!");
		System.out.println("\n\tSeu saldo atual é de: " + saldo + "\n");
	}
	
	public void listaGasto(ManipulaSaldo manpSaldo, EntradaESaida arquivo, String endereco) throws IOException {
		
		System.out.println("Estes são os seus gastos registrados: ");
		
		// atribui o ID que será buscado
		String ID = "Gasto";
		
		// chama o metodo ler atribuindo listar como true
		arquivo.ler(ID, valor, origem, manpSaldo, endereco, true);
		
	}
	
}

