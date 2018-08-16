
//2. Determinar se 3 inteiros formam um tri�ngulo;
import java.util.*;

public class Aula00Exercicio02 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner input = new Scanner(System.in);

		System.out.println("Insira o primeiro n�mero: ");
		a = input.nextInt();
		System.out.println("Insira o segundo n�mero: ");
		b = input.nextInt();
		System.out.println("Insira o terceiro n�mero: ");
		c = input.nextInt();

		if (triangulo(a, b, c)) {
			System.out.println("Os n�meros formam um tri�ngulo");
		} else {
			System.out.println("Os n�meros n�o formam um tri�ngulo");
		}
	}

	public static boolean triangulo(int d, int e, int f) {
		boolean tri = false;

		//Checando se os valores formam um tri�ngulo
		if (d + e > f) {
			if (e + f > d) {
				if (d + f > e) {
					tri = true;
				}
			}
		} else {
			tri = false;
		}
		return tri;
	}
}
