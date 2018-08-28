
/*4. Gerar a forma binária (string de 0’s e 1’s) de um
número inteiro*/
import java.util.*;

public class Aula01Exercicio04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;

		System.out.println("Insira o número inteiro que você deseja passar para binário:");
		num = entrada.nextInt();

		System.out.println("O número " + num + " em binário é " + binario(num));
	}

	public static String binario(int numero) {
		int d = numero;
		StringBuffer bin = new StringBuffer();
		String fim = new String();

		if (numero == 0) {
			fim = "0";
		} else {
			while (d > 0) {
				int b = d % 2;
				bin.append(b);
				d = d >> 1; // é a divisão que você deseja
			}
			fim = bin.reverse().toString();
		}
		return fim;
	}

}
