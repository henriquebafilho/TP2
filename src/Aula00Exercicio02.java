
//2. Determinar se 3 inteiros formam um triângulo;
import java.util.*;

public class Aula00Exercicio02 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner input = new Scanner(System.in);

		System.out.println("Insira o primeiro número: ");
		a = input.nextInt();
		System.out.println("Insira o segundo número: ");
		b = input.nextInt();
		System.out.println("Insira o terceiro número: ");
		c = input.nextInt();

		if (triangulo(a, b, c)) {
			System.out.println("Os números formam um triângulo");
		} else {
			System.out.println("Os números não formam um triângulo");
		}
	}

	public static boolean triangulo(int d, int e, int f) {
		boolean tri = false;

		//Checando se os valores formam um triângulo
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
