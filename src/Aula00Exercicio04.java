
//4. Verificar se uma palavra � um pal�ndromo1;
//1N�o utilizar nenhuma fun��o da classe String � exceto charAt()
import java.util.*;

public class Aula00Exercicio04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String palavra = new String();

		System.out.println("Insira uma palavra para checar se ela � um pal�ndromo:");
		palavra = input.nextLine();

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
			}else{
				palin = false;
				break;
			}
		}

		return palin;
	}
}
