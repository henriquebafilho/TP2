package Aula07Exercicio04;

//Feito por João Victor Antunes Figueira, Leonardo Vartuli Negreiros, Henrique Borges de Almeida Filho
public class Atleta {
	protected String Nome;
	protected int Idade;
	protected String Posicao;

	// CONSTRUTOR
	Atleta(String nome, int idade, String posicao) {
		Nome = nome;
		Idade = idade;
		Posicao = posicao;
	}

	// METODO
	public void FazerAniverario() {
		Idade += 1;
	}

}