package br.edu.senai.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class EntradaESaida {
		
	// Contrutor vazio
	public EntradaESaida() {
		super();			
	}
	
	// metodo de leitura do arquivo 
	public void ler(String iD, double valor, String origem, ManipulaSaldo manpSaldo, String endereco, boolean listar) {
		try {
	
			// Se o arquivo não existir, criar 
			if(!new File(endereco).exists()) {
				new File(endereco).createNewFile();
			}
			
			//Faz a leitura do arquivo
			// foi alterado a forma como é informado o endereço para facilitar a edição 
			FileReader arquivo = new FileReader( endereco );

            //Inicia o objeto de leitura
            BufferedReader leitura = new BufferedReader( arquivo );
            
            //Le a primeira linha
            String linha = leitura.readLine();
            
            //Continua a leitura enquanto o arquivo conter linhas
            while ( linha != null ) {
 
            	// cria vetor para armazenar dados da linha 
            	String dados [];
            	dados = new String [4];
            	
            	// armazena no vetor os dados
            	dados = linha.split(";");

          //  	System.out.println(dados[0] + dados[1] + dados[2] + dados[3] );

                try {
                            	
                    //Tenta converter a parte para double
                	double saldo = Double.parseDouble( dados [3] );
                	
                	if (listar)
                	{
                		if (dados[0].equals(iD))
                		{
                			System.out.println(dados[1] + " - " + dados[2]);
                		}
                	}
                	
                	// Atribui o valor lido
                    manpSaldo.setValor(saldo);
                            	
                 } catch ( NumberFormatException nfe ) {
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
	

	public void escrever(String ID, double valor, String origem, double saldo, String endereco) throws IOException {	 
		
		// foi alterado a forma como informa o endereço para facilitar a localização 
		 FileWriter arquivo = new FileWriter( endereco , true);
		 
		 // Cria o objeto de escrita
		 PrintWriter gravarArq = new PrintWriter(arquivo);
        
		 //escreve a linha no arquivo adicionando separadores para os dados
		 gravarArq.println(ID + ";" + valor + ";" + origem + ";" + saldo);
        
		 //o método flush libera a escrita no arquivo
		 gravarArq.flush();

		 //No final precisamos fechar o arquivo
		 gravarArq.close();
		 
	}
}
