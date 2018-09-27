package Lista03Exercicio05;

import java.util.*;

public class principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Integer> conjunto1 = new ArrayList<Integer>();
		ArrayList<Integer> conjunto2 = new ArrayList<Integer>();

		conjunto1 = editaConjunto(1);
		System.out.println("Pronto! O conjunto 1 j� foi criado.");
		System.out.println("Agora vamos criar o conjunto 2!");
		System.out.println("--------------------------------");
		conjunto2 = editaConjunto(2);
		
		System.out.println("A uni�o dos conjuntos � ");
		System.out.println("A interse��o dos conjuntos � ");
		System.out.println("A diferen�a dos conjuntos � ");
		//dizer se um n�mero � subconjunto do outro
		//dizer se os conjuntos s�o iguais
	}

	public static ArrayList<Integer> editaConjunto(int numConjunto) {
		Scanner entrada = new Scanner(System.in);
		ConjuntoInteiros conjunto = new ConjuntoInteiros();

		System.out.println("Insira quantos n�meros ter� o conjunto " + numConjunto + ":");
		int qtd = entrada.nextInt();
		while (qtd <= 0) {
			System.out.println("Erro. Insira um valor v�lido:");
			qtd = entrada.nextInt();
		}
		// (a) adicionar e remover um n�mero a um conjunto;
		for (int i = 0; i < qtd; i++) {
			System.out.println("Insira o " + (i + 1) + "� elemento do conjunto:");
			int addElemento = entrada.nextInt();
			conjunto.adicionaElemento(addElemento);
		}

		System.out.println("Pronto! Voc� j� adicionou elementos no conjunto " + numConjunto);
		System.out.println("Deseja remover algum elemento? (0 - n�o/ 1 - sim)");
		int deseja = entrada.nextInt();
		while (deseja != 0 && deseja != 1) {
			System.out.println("Erro. Insira um valor v�lido. (0 - n�o/ 1 - sim)");
			deseja = entrada.nextInt();
		}
		if (deseja == 1) {
			System.out.println("Qual elemento voc� deseja remover?");
			int elemento = entrada.nextInt();
			conjunto.removeElemento(elemento);
			System.out.println("Elemento removido com sucesso!");
		}
		// (f) imprimir a descri��o de um conjunto, contendo o seu comprimento e a lista
		// de seus elementos, em nota��o de chaves
		// (b) calcular a cardinalidade de um conjunto, isto �, quantos elementos ele tem
		System.out.println("conjunto " + numConjunto + ": " + conjunto.imprimeResultado());
		return conjunto.getConjunto();
	}

}
