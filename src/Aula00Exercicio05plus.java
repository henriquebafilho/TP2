
//{169, 4, 100, 64, 9, 16, 225, 121, 81, 196, 25, 36, 144, 49}
//5. Calcula a média e o desvio padrão da lista anterior;
import java.util.*;

public class Aula00Exercicio05plus {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList();
		numeros.add(169);
		numeros.add(4);
		numeros.add(100);
		numeros.add(64);
		numeros.add(9);
		numeros.add(16);
		numeros.add(225);
		numeros.add(121);
		numeros.add(81);
		numeros.add(196);
		numeros.add(25);
		numeros.add(36);
		numeros.add(144);
		numeros.add(49);

		System.out.println("A média dos números " + numeros + " é " + calculaMedia(numeros));
		System.out.println("O desvio padrão dos números "+numeros+" é "+calculaDesvio(numeros));
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
