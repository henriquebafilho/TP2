
/*Escreva uma fun¸c˜ao que retorne a forma bin´aria de um inteiro n˜ao-negativo n segundo o
c´odigo de Grey, expressa como uma string de 0‘s e 1‘s. Esta fun¸c˜ao deve possuir o prot´otipo:
public static String codigoGrey (int n )
A forma bin´aria escolhida deve possuir o m´ınimo de bits poss´ıvel. Por exemplo, codigoGrey
(3) deve retornar a string ’100’ (3 bits), enquanto codigoGrey(14) deve retornar a string
’1001’ (4 bits)3
*/
import java.util.*;

public class Lista01Exercicio05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int number;

		System.out.println("Insira um número para passá-lo para binário e Grey Code:");
		number = entrada.nextInt();

		System.out.println("O número " + number + " em binário é " + binario(number));
		System.out.println("O número " + number + " em Gray Code  é " + codigoGrey(binario(number)));
	}

	public static String binario(int numero) {
		int d = numero;
		StringBuffer bin = new StringBuffer();
		String fim;

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

	public static String codigoGrey(String n) {
		String gray = new String("1");
		
		for (int i = 1; i < n.length(); i++) {
			if (n.charAt(i - 1) == n.charAt(i)) {
				gray += "0";
			} else {
				gray += "1";
			}
		}
		return gray;
	}

}