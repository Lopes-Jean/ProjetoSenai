package br.edu.senai.modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener;

public class EntradaESaida {
	
	ManipulaSaldo vSaldo = new ManipulaSaldo(); 
	
	String dados [];
	
	
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
	
	
	// teste TXT 2 
	public void ler() {
		try {

            //Faz a leitura do arquivo
            FileReader arquivo = new FileReader( "C:/Users/Senai/Documents/Jean/ControleFinanceiro/file.txt" );
            
            //Inicia o objeto de leitura
            BufferedReader leitura = new BufferedReader( arquivo );
            
            //Le a primeira linha
            String linha = leitura.readLine();
            
            //Continua a leitura enquanto o arquivo conter linhas
            while ( linha != null ) {

                //verifica se a linha contem o caracter de separacao -
                if ( linha.contains( "-" ) ) {

                    //Pega o nome do aluno
                    String nome = linha.substring( 0, linha.indexOf( '-' ) );
                    
                    //Pega o restante da linha
                    linha = linha.substring( linha.indexOf( '-' ) + 1, linha.length() );
                    
                    //Remove os espaços a mais
                    linha = linha.replaceAll( "  +", " " );

                    double soma = 0;

                    //Percorre cada conjunto de possiveis notas
                    for ( String parte : linha.split( " " ) ) {

                        //Verifica se não esta vazio
                        if ( !parte.isEmpty() ) {
                            try {
                                //Tenta converter a parte para double caso consiga soma a media
                            	//vSaldo.valor = Double.parseDouble( parte );
                            	
                            	double saldo = Double.parseDouble( parte );
                            	vSaldo.atualizaSaldo(saldo);
                            	
                            	
                               // soma += Double.parseDouble( parte );
                            } catch ( NumberFormatException nfe ) {
                            }
                        }
                    }

                }

                //Le a proxima linha
                linha = leitura.readLine();
            }

            arquivo.close();
        } catch ( IOException e ) {
            System.err.printf( "Erro na abertura do arquivo: %s.\n", e.getMessage() );
        }
        System.out.println();
	
	
	}
	
	
//	// Arquivo TXT
//		
//		public void ler(String path) throws IOException {
//	        BufferedReader buffRead = new BufferedReader(new FileReader(path));
//	        String linha = "";
//	        while (true) {
//	            if (linha != null) {
//	                System.out.println(linha);
//	                vSaldo.valor = Double.parseDouble(linha); 
//	                		
//	            } else
//	                break;
//	            linha = buffRead.readLine();
//	        }
//	        buffRead.close();
//	    }
//	 
//	    public static void escrever(String path) throws IOException {
//	        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
//	        String linha = "";
//	        Scanner in = new Scanner(System.in);
//	        System.out.println("Escreva algo: ");
//	        linha = in.nextLine();
//	        buffWrite.append(linha + "\n");
//	        buffWrite.close();
//	    }
		
		
	
		
		
		
//		Arquivo SCV
	    
	    
//		public void ler() {
//
//	    String arquivoCSV = "file.SCV"; // nome do arquivo a ser procurado 
//	    BufferedReader buffer = null; // cria e inicializa o buffer vazio
//	    String linha = ""; // cria e incializa a variavel linha varia 
//	    try {
//
//	        buffer = new BufferedReader(new FileReader(arquivoCSV));
//	        while ((linha = buffer.readLine()) != null) {
//
//	    		String [] dados = linha.split(",");
//	            
//	            System.out.println(dados[0]);
//	            
//	            vSaldo.valor = Double.parseDouble(this.dados[0]);
//	            
//
//	        }
//
//	    } catch (FileNotFoundException ex) {
//	        ex.printStackTrace();
//	    } catch (IOException e) {
//	        e.printStackTrace();
//	    } finally {
//	        if (buffer != null) {
//	            try {
//	                buffer.close();
//	            } catch (IOException e) {
//	                e.printStackTrace();
//	            }
//	        }
//	    }
//	  }

}
