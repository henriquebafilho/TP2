
//3. Verifica se a palavra �ATTACGGAGGTCCATACTTGGTTCATCCTGGAGGCATTA� (sem espa�os) � um pal�ndromo;
import java.util.*;

public class Exercicio04plus {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String palavra = new String("ATTACGGAGGTCCATACTTGGTTCATCCTGGAGGCATTA");

		if (palindromo(palavra)) {
			System.out.println("A palavra � um pal�ndromo.");
		} else {
			System.out.println("A palavra n�o � um pal�ndromo.");
		}
	}

	public static boolean palindromo(String p) {
		boolean palin = false;

		for (int i = 0; i < p.length(); i++) {
			if (p.charAt(i) == p.charAt(p.length() - 1 - i)) {
				palin = true;
			} else {
				palin = false;
				break;
			}
		}

		return palin;
	}
}