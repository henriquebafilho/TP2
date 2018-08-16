
//3. Contar inteiros pares em uma lista de inteiros;
import java.util.*;

public class Aula00Exercicio03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numeros = new int[10];

		// Atribuindo valores ao array
		for (int i = 0; i < 10; i++) {
			System.out.println("Insira o " + (i + 1) + "º número:");
			numeros[i] = input.nextInt();
		}
		if (qtdPares(numeros) == 1) {
			System.out.println("1 número citados é par.");
		} else if (qtdPares(numeros) > 1) {
			System.out.println(qtdPares(numeros) + " números citados são pares.");
		} else {
			System.out.println("Nenhum número citado é par.");
		}
	}

	public static int qtdPares(int[] a) {
		int qtd = 0;

		// Checando quantos inteiros citados são pares
		for (int i = 0; i < 10; i++) {
			if (a[i] % 2 == 0) {
				qtd++;
			}
		}

		return qtd;
	}
}
