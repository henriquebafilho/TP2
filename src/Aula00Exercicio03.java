
//3. Contar inteiros pares em uma lista de inteiros;
import java.util.*;

public class Aula00Exercicio03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numeros = new int[10];

		// Atribuindo valores ao array
		for (int i = 0; i < 10; i++) {
			System.out.println("Insira o " + (i + 1) + "� n�mero:");
			numeros[i] = input.nextInt();
		}
		if (qtdPares(numeros) == 1) {
			System.out.println("1 n�mero citados � par.");
		} else if (qtdPares(numeros) > 1) {
			System.out.println(qtdPares(numeros) + " n�meros citados s�o pares.");
		} else {
			System.out.println("Nenhum n�mero citado � par.");
		}
	}

	public static int qtdPares(int[] a) {
		int qtd = 0;

		// Checando quantos inteiros citados s�o pares
		for (int i = 0; i < 10; i++) {
			if (a[i] % 2 == 0) {
				qtd++;
			}
		}

		return qtd;
	}
}
