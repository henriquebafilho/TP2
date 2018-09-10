
/*Calcular o n-esimo numero de Pell. A sequencia de numeros de Pell comeca com os
numeros 0 e 1 (respectivamente, o 0-esimo e primeiro numeros de Pell), e cada um dos
demais elementos ́e obtido pela expressão:
Chamada de teste: calcular o 15o numero de Pell*/
import java.util.*;

public class Lista01Exercicio01c {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = 15;

		System.out.println("O " + num + "º número de Pell é " + calculaPellRecursivo(num));
		System.out.println("O " + num + "º número de Pell é " + calculaPellIterativo(num));
	}

	public static int calculaPellRecursivo(int n) {
		if (n == 1) {
			return 0;
		} else if (n == 2) {
			return 1;
		} else {
			return 2 * calculaPellRecursivo(n - 1) + calculaPellRecursivo(n - 2);
		}
	}

	public static int calculaPellIterativo(int n) {
		int[] pellNumbers = new int[n];
		
		for (int i = 0; i < n; i++) {
			if(i==0) {
				pellNumbers[0] = 0;
			}else if(i==1) {
				pellNumbers[1] = 1;
			}else {
				pellNumbers[i] = (2 * pellNumbers[i-1]) + pellNumbers[i-2];
			}
		}
		return pellNumbers[n-1];
	}
}
