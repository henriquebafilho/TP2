
//4. Conta a quantidade de pares na lista {169, 4, 100, 64, 9, 16, 225, 121, 81, 196, 25, 36, 144, 49}.
import java.util.Scanner;

public class Aula00Exercicio03plus {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numeros = new int[14];
		numeros[0] = 169;
		numeros[1] = 4;
		numeros[2] = 100;
		numeros[3] = 64;
		numeros[4] = 9;
		numeros[5] = 16;
		numeros[6] = 225;
		numeros[7] = 121;
		numeros[8] = 81;
		numeros[9] = 196;
		numeros[10] = 25;
		numeros[11] = 36;
		numeros[12] = 144;
		numeros[13] = 49;

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
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				qtd++;
			}
		}

		return qtd;
	}
}