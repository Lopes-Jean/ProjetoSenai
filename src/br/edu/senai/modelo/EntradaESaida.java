package br.edu.senai.modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EntradaESaida {
	private String Saldo;
	private String Gastos;
	private String Receita;
	
	
	public EntradaESaida() {
		
		super();
		
	}


	public EntradaESaida(String saldo, String gastos, String receita) {
		super();
		Saldo = saldo;
		Gastos = gastos;
		Receita = receita;
	}


	public String getSaldo() {
		return Saldo;
	}


	public void setSaldo(String saldo) {
		Saldo = saldo;
	}


	public String getGastos() {
		return Gastos;
	}


	public void setGastos(String gastos) {
		Gastos = gastos;
	}


	public String getReceita() {
		return Receita;
	}


	public void setReceita(String receita) {
		Receita = receita;
	}
	
	
	

//	public void run() {
//
//	    String arquivoCSV = "file.SCV";
//	    BufferedReader br = null;
//	    String linha = "";
//	    String csvDivisor = ",";
//	    try {
//
//	        br = new BufferedReader(new FileReader(arquivoCSV));
//	        while ((linha = br.readLine()) != null) {
//
//	            String[] pais = linha.split(csvDivisor);
//
//	            System.out.println("Pais [code= " + pais[pais.length-4] 
//	                                 + " , name=" + pais[pais.length-1] + "]");
//
//	        }
//
//	    } catch (FileNotFoundException e) {
//	        e.printStackTrace();
//	    } catch (IOException e) {
//	        e.printStackTrace();
//	    } finally {
//	        if (br != null) {
//	            try {
//	                br.close();
//	            } catch (IOException e) {
//	                e.printStackTrace();
//	            }
//	        }
//	    }
//	  }

}
