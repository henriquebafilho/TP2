
/*Calcular o valor de n^k, para valores inteiros de n e k.*/
import java.util.*;

public class Lista01Exercicio01b {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int base, expoente;
		
		System.out.println("Insira a base:");
		base = entrada.nextInt();
		System.out.println("Insira o expoente:");
		expoente = entrada.nextInt();
		
		System.out.println("O resultado é "+potenciaIterativa(base,expoente));
		System.out.println("O resultado é "+potenciaRecursiva(base,expoente));
	}
	public static int potenciaIterativa(int n, int k) {
		int resultado = 0;
		
		for(int i = 1; i <= k; i++) {
			if(i==1) {
				resultado = n;
			}else {
				resultado = resultado * n;
			}
		}
		return resultado;
	}
	public static int potenciaRecursiva(int base,int vezes) {
		if(vezes==1) {
			return base;
		}else {
			return base * potenciaRecursiva(base,vezes-1);
		}
	}
}
