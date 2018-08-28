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

	public static int [] lerProximoPredio( String entradap ) {
        int [] predio = new int [3];
        String prediop[] = entradap.split(" ");
        for(int i = 0; i<predio.length;i++) {
        	predio[i] = Integer.parseInt(prediop[i]); 
        }
        System.out.println(predio[0] + " " + predio[1] + " " + predio[2]);
        return predio;
    }    
		// TAREFA 1: implementar esta função
        // para ler um número a partir da entrada: entrada.nextInt();
        
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
        String inicio = "0 ";
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
	        }
        	if(conteudo == 0) {
	        	if(anterior != conteudo) {
	        		saida += Integer.toString(i-1);
	        		saida += " - ";
	        		saida += Integer.toString(conteudo);
	        		saida += " - ";
	        		anterior = conteudo;
	        		
	            }
	        }
            
        }
        return saida;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner( new File( "src/testePDF.txt" ) );
            // para uso com Online Judge: comentar a linha de cima
            //                       e descomentar a linha de baixo
            // Scanner entrada = new Scanner( System.in );
            int X_MAX = 10000;
            
            // TAREFA 4: documentar o skyline, isto é, explicar como e
            //           por que estamos representando um skyline como
            //           um array de tamanho fixo em vez de utilizar a
            //           representação que o problema pede
            int [] skyline = new int [X_MAX+1];
            for(int i = 0; i < skyline.length; i++) {
            	skyline[i]= 0 ;
            }
            
            int [] predio = null;
            
            while( entrada.hasNext() ) {
            	
            	String entradapredio = entrada.nextLine();
                predio = lerProximoPredio( entradapredio );
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
	


