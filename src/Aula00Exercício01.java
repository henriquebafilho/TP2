
//1. Determinar se um inteiro � primo;
import java.util.*;

public class Aula00Exerc�cio01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inserido;
		
		System.out.println("Insira um n�mero inteiro:");
		inserido = input.nextInt();
		
		if(testaPrimo(inserido)) {
			System.out.println("O n�mero "+inserido+" � primo");
		}else {
			System.out.println("O n�mero "+inserido+" n�o � primo");
		}
	}
	public static boolean testaPrimo(int p) {
		boolean primo = false;
		int divisores = 0;
		
		for(int i = p; i > 0; i--) {
			if(p%i==0) {
				divisores++;
			}
		}
		if(divisores==2) {
			primo = true;
			return primo;
		}else {
			return primo;
		}
	}
}
