
/*2. Calcular o m�ximo divisor comum entre dois inteiros positivos
I Use o m�todo de Euclides: se a > b e b n�o divide a,
ent�o MDC(a, b) = MDC(b, a mod b)*/
import java.util.*;

public class Aula01Exercicio02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int primeiro, segundo;

		System.out.println("Calcule o MDC!");
		System.out.println("1 - Insira o primeiro n�mero:");
		primeiro = entrada.nextInt();
		while(primeiro<=0) {
			System.out.println("1 - Insira um n�mero POSITIVO:");
			primeiro = entrada.nextInt();
		}
		System.out.println("2 - Insira o segundo n�mero:");
		segundo = entrada.nextInt();
		while(segundo<=0) {
			System.out.println("2 - Insira um n�mero POSITIVO:");
			segundo = entrada.nextInt();
		}

		System.out.println("MDC(" + primeiro + ", " + segundo + ") = "+mdc(primeiro,segundo));
	}

	public static int mdc(int a, int b) {
		if (a > b && a % b != 0) {
			return mdc(b, a % b);
		} else if (b > a && b % a != 0) {
			return mdc(a, b % a);
		} else {
			if(a>b) {
				return a/b;
			}else {
				return b/a;
			}
		}
	}
}
