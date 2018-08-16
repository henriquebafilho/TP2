
//1. Determina se o número 180.421.597 é primo;
import java.util.*;

public class Aula00Exercício01plus {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inserido = 180421597;
		
		if(testaPrimo(inserido)) {
			System.out.println("O número "+inserido+" é primo");
		}else {
			System.out.println("O número "+inserido+" não é primo");
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
