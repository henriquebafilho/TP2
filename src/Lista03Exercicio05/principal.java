package Lista03Exercicio05;

import java.util.*;

public class principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//ArrayList<Integer> conjunto1 = new ArrayList<Integer>();
		ConjuntoInteiros conjunto1 = new ConjuntoInteiros();
		ConjuntoInteiros conjunto2 = new ConjuntoInteiros();

		conjunto1 = editaConjunto(1);
		System.out.println("Pronto! O conjunto 1 já foi criado.");
		System.out.println("Agora vamos criar o conjunto 2!");
		System.out.println("--------------------------------");
		conjunto2 = editaConjunto(2);
		
		//(c) calcular união, interseção e diferença de dois conjuntos;
		System.out.println("A união dos conjuntos é "+conjunto1.uniao(conjunto1, conjunto2));
		System.out.println("A interseção dos conjuntos é "+conjunto1.intersecao(conjunto1, conjunto2));
		System.out.println("A diferença dos conjuntos é "+conjunto1.diferenca(conjunto1, conjunto2));
		//(d) decidir se um conjunto é subconjunto de outro;
		System.out.println(conjunto1.subconjunto(conjunto1, conjunto2));
		//(e) decidir se dois conjuntos são iguais;
		System.out.println(conjunto1.testaIgualdade(conjunto1, conjunto2));
	}

	public static ConjuntoInteiros editaConjunto(int numConjunto) {
		Scanner entrada = new Scanner(System.in);
		ConjuntoInteiros conjunto = new ConjuntoInteiros();

		System.out.println("Insira quantos números terá o conjunto " + numConjunto + ":");
		int qtd = entrada.nextInt();
		while (qtd <= 0) {
			System.out.println("Erro. Insira um valor válido:");
			qtd = entrada.nextInt();
		}
		// (a) adicionar e remover um número a um conjunto;
		for (int i = 0; i < qtd; i++) {
			System.out.println("Insira o " + (i + 1) + "º elemento do conjunto:");
			int addElemento = entrada.nextInt();
			conjunto.adicionaElemento(addElemento);
		}

		System.out.println("Pronto! Você já adicionou elementos no conjunto " + numConjunto);
		System.out.println("Deseja remover algum elemento? (0 - não/ 1 - sim)");
		int deseja = entrada.nextInt();
		while (deseja != 0 && deseja != 1) {
			System.out.println("Erro. Insira um valor válido. (0 - não/ 1 - sim)");
			deseja = entrada.nextInt();
		}
		if (deseja == 1) {
			System.out.println("Qual elemento você deseja remover?");
			int elemento = entrada.nextInt();
			conjunto.removeElemento(elemento);
			System.out.println("Elemento removido com sucesso!");
		}
		// (f) imprimir a descrição de um conjunto, contendo o seu comprimento e a lista
		// de seus elementos, em notação de chaves
		// (b) calcular a cardinalidade de um conjunto, isto é, quantos elementos ele tem
		System.out.println("conjunto " + numConjunto + ": " + conjunto.imprimeResultado());
		return conjunto;
	}

}
