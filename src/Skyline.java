/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author labccet
 */
public class Skyline {

    public static int [] lerProximoPredio( Scanner entrada ) {
        int [] predio = new int [3];
        int scan = entrada;	
        predio[i] = scan;
		// TAREFA 1: implementar esta função
        // para ler um número a partir da entrada: entrada.nextInt();
        
        return predio;
    }
    
    public static void adicionarPredio( int [] predio, int [] skyline ) {
        int L = predio[0];
        int H = predio[1];
        int R = predio[2];
        
        for(int i = L; i <= R; i++) {	
        int comparativo = skyline[i];
        	if(H > comparativo){
            skyline[i] = H;
            }
        }
    	// TAREFA 2: implementar esta função
    }
    
    public static String gerarSaida( int [] skyline ) {
        String saida = "";
        int anterior = 0;
        for(int i = 0; i < skyline.length; i++) {
        	int conteudo = skyline[i];
        	if(conteudo > 0) {
	        	if(anterior != conteudo) {
	        		
	        		saida += Integer.toString(i);
	        		saida += " - ";
	        		saida += Integer.toString(conteudo);
	        		saida += " - ";
	        		anterior = conteudo;
	            }
	        } else if (conteudo == 0 && anterior != 0) {
	        	break;
	        }
    	// TAREFA 3: implementar esta função
        }
        return saida;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner( new File( "testePDF.txt" ) );
            // para uso com Online Judge: comentar a linha de cima
            //                       e descomentar a linha de baixo
            // Scanner entrada = new Scanner( System.in );
            int X_MAX = 10000;
            
            // TAREFA 4: documentar o skyline, isto é, explicar como e
            //           por que estamos representando um skyline como
            //           um array de tamanho fixo em vez de utilizar a
            //           representação que o problema pede
            int [] skyline = new int [X_MAX+1];
            int [] predio = null;
            
            while( entrada.hasNext() ) {
                predio = lerProximoPredio( entrada );
                adicionarPredio( predio, skyline );
            }
            String saida = gerarSaida( skyline );
            System.out.println( saida );
        	}
        	catch (FileNotFoundException ex) {
            System.out.println( "ERRO: Arquivo não encontrado." );
        
        }
    
    }
}

