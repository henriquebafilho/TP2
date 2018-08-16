
//4. Verificar se uma palavra é um palíndromo1;
//1Não utilizar nenhuma função da classe String — exceto charAt()
import java.util.*;

public class Aula00Exercicio04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String palavra = new String();

		System.out.println("Insira uma palavra para checar se ela é um palíndromo:");
		palavra = input.nextLine();

		if (palindromo(palavra)) {
			System.out.println("A palavra é um palíndromo.");
		} else {
			System.out.println("A palavra não é um palíndromo.");
		}
	}

	public static boolean palindromo(String p) {
		boolean palin = false;

		for (int i = 0; i < p.length(); i++) {
			if (p.charAt(i) == p.charAt(p.length() - 1 - i)) {
				palin = true;
			}else{
				palin = false;
				break;
			}
		}

		return palin;
	}
}
