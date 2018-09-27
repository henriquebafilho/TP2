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
		for (int i = 0; i < conjunto.size()-1; i++) {
			if (this.conjunto.get(i) == elemento) {
				this.conjunto.remove(i);
			}
		}
	}
	
	//(c) calcular uni�o, interse��o e diferen�a de dois conjuntos;
	public ArrayList<Integer> uniao(ArrayList<Integer> a,ArrayList<Integer> b){
		ArrayList<Integer> uniao = new ArrayList<Integer>();
		//TODO
		return uniao;
	}
	
	public ArrayList<Integer> intersecao(ArrayList<Integer> a,ArrayList<Integer> b){
		ArrayList<Integer> intersecao = new ArrayList<Integer>();
		//TODO
		return intersecao;
	}
	
	public ArrayList<Integer> diferencaDeConjuntos(ArrayList<Integer> a,ArrayList<Integer> b){
		ArrayList<Integer> diferenca = new ArrayList<Integer>();
		//TODO
		return diferenca;
	}
	
	//(d) decidir se um conjunto � subconjunto de outro;
	public String subconjunto(ArrayList<Integer> a,ArrayList<Integer> b){
		String sub = new String();
		//TODO
		return sub;
	}
	
	//(e) decidir se dois conjuntos s�o iguais;
	public String testaIgualdade(ArrayList<Integer> a,ArrayList<Integer> b){
		String igual = new String();
		//TODO
		return igual;
	}
	
	//(f) imprimir a descri��o de um conjunto, contendo o seu comprimento e a lista de seus
	//elementos, em nota��o de chaves
	// (b) calcular a cardinalidade de um conjunto, isto �, quantos elementos ele tem
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
