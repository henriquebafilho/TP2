
/*2. Calcular o máximo divisor comum entre dois inteiros positivos
I Use o método de Euclides: se a > b e b não divide a,
então MDC(a, b) = MDC(b, a mod b)*/
import java.util.*;

public class Aula01Exercicio02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int primeiro, segundo;

		System.out.println("Calcule o MDC!");
		System.out.println("1 - Insira o primeiro número:");
		primeiro = entrada.nextInt();
		while (primeiro <= 0) {
			System.out.println("1 - Insira um número POSITIVO:");
			primeiro = entrada.nextInt();
		}
		System.out.println("2 - Insira o segundo número:");
		segundo = entrada.nextInt();
		while (segundo <= 0) {
			System.out.println("2 - Insira um número POSITIVO:");
			segundo = entrada.nextInt();
		}

		System.out.println("MDC(" + primeiro + ", " + segundo + ") = " + mdc(primeiro, segundo));
	}

	public static int mdc(int a, int b) {
		int resto = a % b;
		
		if (resto != 0) {
			return mdc(b, resto);
		} else {
			return b;
		}
	}
}
