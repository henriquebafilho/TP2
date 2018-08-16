//2. Determinar se os números 348, 567 e 937 formam um triângulo;
import java.util.*;

public class Aula00Exercicio02plus {
	public static void main(String[] args) {
		int a = 348, b = 567, c = 937;
		Scanner input = new Scanner(System.in);

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
