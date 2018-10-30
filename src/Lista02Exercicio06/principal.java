package Lista02Exercicio06;

import java.util.*;

public class principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		ConjuntoInteiros conjunto1 = new ConjuntoInteiros();
		ConjuntoInteiros conjunto2 = new ConjuntoInteiros();

		conjunto1 = editaConjunto(1);
		System.out.println("Pronto! O conjunto 1 j� foi criado.");
		System.out.println("Agora vamos criar o conjunto 2!");
		System.out.println("--------------------------------");
		conjunto2 = editaConjunto(2);

		System.out.println("A uni�o dos conjuntos � " + conjunto1.uniao(conjunto1, conjunto2));
		System.out.println("A interse��o dos conjuntos � " + conjunto1.intersecao(conjunto1, conjunto2));
		System.out.println("A diferen�a dos conjuntos � " + conjunto1.diferenca(conjunto1, conjunto2));
		System.out.println(conjunto1.subconjunto(conjunto1, conjunto2));
		System.out.println(conjunto1.testaIgualdade(conjunto1, conjunto2));
	}

	public static ConjuntoInteiros editaConjunto(int numConjunto) {
		Scanner entrada = new Scanner(System.in);
		ConjuntoInteiros conjunto = new ConjuntoInteiros();

		System.out.println("Insira quantos n�meros ter� o conjunto " + numConjunto + ":");
		int qtd = entrada.nextInt();
		while (qtd <= 0) {
			System.out.println("Erro. Insira um valor v�lido:");
			qtd = entrada.nextInt();
		}

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
		System.out.println("conjunto " + numConjunto + ": " + conjunto.imprimeResultado());
		return conjunto;
	}

}
