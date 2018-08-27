
/*1. Calcular o n-�simo n�mero de Fibonacci
I A sequ�ncia de Fibonacci come�a com 0 e 1, e cada
n�mero � igual a soma dos dois anteriores
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, . . .*/
import java.util.*;

public class Aula01Exercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int posicao;
		
		System.out.println("Insira a posi��o do n�mero desejado na sequ�ncia de Fibonacci:");
		posicao = entrada.nextInt();
		
		System.out.println("O n�mero correspondente � posi��o "+posicao+" � "+Fibonacci(posicao));
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
