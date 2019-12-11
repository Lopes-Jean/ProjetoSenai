package br.edu.senai.modelo;

public class Manipula {
	
	protected String origem;
	protected double valor;
	
	
	public Manipula() {

	}
	
	
	public Manipula(String origem, double valor) {
		super();
		this.origem = origem;
		this.valor = valor;
	}


	public String getOrigem() {
		return origem;
	}


	public void setOrigem(String origem) {
		this.origem = origem;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	
	
	


	
	
}
