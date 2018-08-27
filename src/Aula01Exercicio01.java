
/*1. Calcular o n-ésimo número de Fibonacci
I A sequência de Fibonacci começa com 0 e 1, e cada
número é igual a soma dos dois anteriores
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, . . .*/
import java.util.*;

public class Aula01Exercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int posicao;
		
		System.out.println("Insira a posição do número desejado na sequência de Fibonacci:");
		posicao = entrada.nextInt();
		
		System.out.println("O número correspondente à posição "+posicao+" é "+Fibonacci(posicao));
	}
	public static int Fibonacci(int n) {
		if(n==1) {
			return 0;
		} else if (n==2){
			return 1 + Fibonacci(n-1);
		} else {
			return Fibonacci(n-1) + Fibonacci(n-2); 
		}
	}

}
