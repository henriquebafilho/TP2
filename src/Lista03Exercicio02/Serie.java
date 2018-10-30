package Lista03Exercicio02;

import java.util.*;

public class Serie {
	String sinopse = new String();
	String genero = new String();
	String nome = new String();
	ArrayList<String> elenco = new ArrayList();
	ArrayList<Episodio> episodios = new ArrayList();
	int temporadas, anoLancamento;

	Serie(String nome, String sinopse, int anoLancamento, String genero, int temporadas, ArrayList<String> elenco, ArrayList<Episodio> episodios) {
		this.nome = nome;
		this.sinopse = sinopse;
		this.anoLancamento = anoLancamento;
		this.genero = genero;
		this.temporadas = temporadas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	// Calcular total de episódios de uma série;
	public int qtdEpisodios(ArrayList<Episodio> episodios) {
		return episodios.size();
	}

	public ArrayList<Episodio> getEpisodios() {
		return episodios;
	}

	public void setEpisodios(ArrayList<Episodio> episodios) {
		this.episodios = episodios;
	}

	public void setElenco(ArrayList<String> elenco) {
		this.elenco = elenco;
	}

	// Adicionar um novo episódio a uma série;
	public void setEpisodio(Episodio episodio) {
		this.episodios.add(episodio);
	}

	public void setElenco(String ator) {
		this.elenco.add(ator);
	}

	public ArrayList<String> getElenco() {
		return elenco;
	}

	public int getDuracao() {
		int duracao = 0;

		for (Episodio epi : this.episodios) {
			epi.duracao += duracao;
		}
		return duracao;
	}

}
