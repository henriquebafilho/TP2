package Lista03Exercicio02;

import java.util.*;

public class Episodio {
	Serie serie;
	String diretor = new String();
	String sinopse = new String();
	int dataLancamento, temporada, episodio, duracao; //duração em minutos
	
	Episodio(Serie serie, int temporada, int episodio, int duracao, String sinopse, int dataLancamento, String diretor) {
		this.serie = serie;
		this.sinopse = sinopse;
		this.episodio = episodio;
		this.diretor = diretor;
		this.dataLancamento = dataLancamento;
		this.duracao = duracao;
	}

	public int getEpisodio() {
		return episodio;
	}

	public void setEpisodio(int episodio) {
		this.episodio = episodio;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public int getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(int dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
}
