
/*4. Gerar a forma bin�ria (string de 0�s e 1�s) de um
n�mero inteiro*/
import java.util.*;

public class Aula01Exercicio04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;

		System.out.println("Insira o n�mero inteiro que voc� deseja passar para bin�rio:");
		num = entrada.nextInt();

		System.out.println("O n�mero " + num + " em bin�rio � " + binario(num));
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
				d = d >> 1; // � a divis�o que voc� deseja
			}
			fim = bin.reverse().toString();
		}
		return fim;
	}

}
