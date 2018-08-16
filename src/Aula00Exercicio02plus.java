//2. Determinar se os n�meros 348, 567 e 937 formam um tri�ngulo;
import java.util.*;

public class Aula00Exercicio02plus {
	public static void main(String[] args) {
		int a = 348, b = 567, c = 937;
		Scanner input = new Scanner(System.in);

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
