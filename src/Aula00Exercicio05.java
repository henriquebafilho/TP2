
//Calcular m�dia e desvio padr�o de uma lista de n�meros
import java.util.*;
import java.lang.*;

public class Aula00Exercicio05 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList();

		// Inserindo valores ao arraylist
		for (int i = 1; i <= 10; i++) {
			numeros.add(i);
		}
		System.out.println("A m�dia dos n�meros " + numeros + " � " + calculaMedia(numeros));
		System.out.println("O desvio padr�o dos n�meros "+numeros+" � "+calculaDesvio(numeros));
	}

	public static float calculaMedia(ArrayList<Integer> m) {
		float media, soma = 0;

		// Somando os valores do arraylist
		for (int i = 0; i < m.size(); i++) {
			soma += m.get(i);
		}
		media = soma / m.size();
		return media;
	}
	public static float calculaDesvio(ArrayList<Integer> d) {
		float soma = 0, divisao, desvio;
		
		//somando os valores
		for(int i = 0; i < d.size(); i++) {
			soma += Math.pow(d.get(i)-calculaMedia(d), 2);
		}
		//calculando desvio
		divisao = soma/d.size();
		desvio = (float)Math.sqrt(divisao);
		return desvio;		
	}
}
