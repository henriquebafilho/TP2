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
	public HashSet<Integer> uniao(ConjuntoInteiros a, ConjuntoInteiros b) {
		HashSet<Integer> uniao = new HashSet<Integer>();
		int igual = 0;

		// adicionando os elementos do conjunto a e b ao conjunto uni�o
		for (int i = 0; i < a.cardinalidade(); i++) {
			uniao.add(a.getConjunto().get(i));
		}
		for (int i = 0; i < b.cardinalidade(); i++) {
			uniao.add(b.getConjunto().get(i));
		}
		return uniao;
	}

	public HashSet<Integer> intersecao(ConjuntoInteiros a, ConjuntoInteiros b) {
		HashSet<Integer> intersecao = new HashSet<Integer>();

		for (int i = 0; i < a.cardinalidade(); i++) {
			for (int j = 0; j < b.cardinalidade(); j++) {
				if (a.getConjunto().get(i) == b.getConjunto().get(j)) {
					intersecao.add(a.getConjunto().get(i));
				}
			}
		}
		return intersecao;
	}

	public HashSet<Integer> diferenca(ConjuntoInteiros a, ConjuntoInteiros b) {
		HashSet<Integer> diferenca = new HashSet<Integer>();
		int igual = 0;

		// Adicionando os elementos de a na diferen�a
		for (int i = 0; i < a.cardinalidade(); i++) {
			igual = 0;
			for (int j = 0; j < b.cardinalidade(); j++) {
				if (a.getConjunto().get(i) == b.getConjunto().get(j)) {
					igual += 1;
				}
			}
			if (igual == 0) {
				diferenca.add(a.getConjunto().get(i));
			}
		}
		// Adicionando os elementos de b na diferen�a
		for (int i = 0; i < b.cardinalidade(); i++) {
			igual = 0;
			for (int j = 0; j < a.cardinalidade(); j++) {
				if (b.getConjunto().get(i) == a.getConjunto().get(j)) {
					igual += 1;
				}
			}
			if (igual == 0) {
				diferenca.add(b.getConjunto().get(i));
			}
		}
		return diferenca;
	}

	// (d) decidir se um conjunto � subconjunto de outro;
	public String subconjunto(ConjuntoInteiros a, ConjuntoInteiros b) {
		int iguais = 0;
		
		if(a.cardinalidade()>b.cardinalidade()) {
			for(int i = 0; i < a.cardinalidade(); i++) {
				for(int j = 0; j < b.cardinalidade(); j++) {
					if(a.getConjunto().get(i)==b.getConjunto().get(j)) {
						iguais += 1;
					}
				}
			}
			if(iguais==b.cardinalidade()) {
				return "b � um subconjunto de a";
			}else {
				return "b n�o � um subconjunto de a";
			}
		}else if(b.cardinalidade()>a.cardinalidade()) {
			for(int i = 0; i < b.cardinalidade(); i++) {
				for(int j = 0; j < a.cardinalidade(); j++) {
					if(b.getConjunto().get(i)==a.getConjunto().get(j)) {
						iguais += 1;
					}
				}
			}
			if(iguais==a.cardinalidade()) {
				return "a � um subconjunto de b";
			}else {
				return "a n�o � um subconjunto de b";
			}
		}else {
			if(testaIgualdade(a,b)=="Os conjuntos n�o s�o iguais") {
				return "Um conjunto n�o � subconjunto do outro";
			}else {
				return "Um conjunto � subconjunto do outro e s�o iguais";
			}
		}
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
	// de seus elementos, em nota��o de chaves
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
