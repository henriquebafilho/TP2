
/*Calcular a soma dos quadrados de todos os inteiros de 1 até n.
Protótipo: public static int somaDeQuadrados (int n)*/
import java.util.*;
import java.lang.*;

public class Lista01Exercicio01a {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;

		System.out.println("Insira um número inteiro:");
		num = entrada.nextInt();

		System.out.println("A soma dos quadrados dos números de 1 a " + num + " é " + somaDeQuadradosRecursiva(num));
		System.out.println("A soma dos quadrados dos números de 1 a " + num + " é " + somaDeQuadradosIterativa(num));
	}

	public static int somaDeQuadradosRecursiva(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * n + somaDeQuadradosRecursiva(n - 1);
		}
	}

	public static int somaDeQuadradosIterativa(int n) {
		int soma = 0;

		for (int i = 1; i <= n; i++) {
			soma += i * i;
		}
		return soma;
	}
}
