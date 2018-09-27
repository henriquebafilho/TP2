/*Crie uma classe ConjuntoInteiros para representar conjuntos finitos de n�meros inteiros.*/
package Lista03Exercicio05;

import java.util.*;

public class ConjuntoInteiros {
	ArrayList<Integer> conjunto = new ArrayList<Integer>();

	// (a) adicionar e remover um n�mero a um conjunto;
	public void adicionaElemento(int elemento) {
		this.conjunto.add(elemento);
	}

	public void removeElemento(int elemento) {
		for (int i = 0; i < conjunto.size() - 1; i++) {
			if (this.conjunto.get(i) == elemento) {
				this.conjunto.remove(i);
			}
		}
	}

	// (b) calcular a cardinalidade de um conjunto, isto �, quantos elementos ele
	// tem
	public int cardinalidade() {
		return this.conjunto.size();
	}

	// (c) calcular uni�o, interse��o e diferen�a de dois conjuntos;
	public ArrayList<Integer> uniao(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> uniao = new ArrayList<Integer>();
		// TODO
		return uniao;
	}

	public ArrayList<Integer> intersecao(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> intersecao = new ArrayList<Integer>();
		// TODO
		return intersecao;
	}

	public ArrayList<Integer> diferencaDeConjuntos(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> diferenca = new ArrayList<Integer>();
		// TODO
		return diferenca;
	}

	// (d) decidir se um conjunto � subconjunto de outro;
	public String subconjunto(ArrayList<Integer> a, ArrayList<Integer> b) {
		String sub = new String();
		// TODO
		return sub;
	}

	// (e) decidir se dois conjuntos s�o iguais;
	public String testaIgualdade(ConjuntoInteiros a, ConjuntoInteiros b) {
		int numIguais = 0;

		if (a.cardinalidade() == b.cardinalidade()) {
			for (int i = 0; i < a.cardinalidade(); i++) {
				for (int z = 0; z < b.cardinalidade(); z++) {
					if (a.getConjunto().get(i) == b.getConjunto().get(z)) {
						numIguais += 1;
					}
				}
			}
			System.out.println("numiguais "+numIguais);
			System.out.println("a cardinal "+a.cardinalidade());
			System.out.println("b cardinal "+b.cardinalidade());
			if (numIguais == a.cardinalidade()) {
				return "Os conjuntos s�o iguais";
			} else {
				return "Os conjuntos n�o s�o iguais";
			}
		} else {
			return "Os conjuntos n�o s�o iguais";
		}
	}

	// (f) imprimir a descri��o de um conjunto, contendo o seu comprimento e a lista
	// de seus
	// elementos, em nota��o de chaves
	public String imprimeResultado() {
		return this.conjunto.size() + " elementos. " + this.conjunto;
	}

	public ArrayList<Integer> getConjunto() {
		return conjunto;
	}

	public void setConjunto(ArrayList<Integer> conjunto) {
		this.conjunto = conjunto;
	}

}
