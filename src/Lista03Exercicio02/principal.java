package Lista03Exercicio02;

import java.util.*;

public class principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Criando a série
		Serie bobEsponja = new Serie("Bob Esponja", "Uma esponja que vive no mar e veste uma calça quadrada.", 1999,
				"Comédia", 2);

		// Setando elenco da série
		bobEsponja.setElenco("Bob Esponja");
		bobEsponja.setElenco("Patrick");
		bobEsponja.setElenco("Sr. Siriguejo");
		bobEsponja.setElenco("Lula Molusco");
		bobEsponja.setElenco("Sandy");
		bobEsponja.setElenco("Plancton");

		// Criando episodios
		Episodio t01e01 = new Episodio(bobEsponja, 1, 1, 20, "Bob Esponja vai trabalhar no Siri Cascudo.", 1999,
				"Stephen Hillenburg");
		Episodio t01e02 = new Episodio(bobEsponja, 1, 2, 20, "Bob Esponja vai à casa de Patrick.", 1999,
				"Stephen Hillenburg");
		Episodio t01e03 = new Episodio(bobEsponja, 1, 3, 20, "Bob Esponja conhece Sandy.", 1999, "Stephen Hillenburg");
		Episodio t02e01 = new Episodio(bobEsponja, 2, 1, 20, "Bob Esponja vai caçar algas-vivas.", 1999,
				"Stephen Hillenburg");
		Episodio t02e02 = new Episodio(bobEsponja, 2, 2, 20,
				"Placton tenta descobrir a fórmula secreta do hambúrguer de siri.", 1999, "Stephen Hillenburg");
		Episodio t02e03 = new Episodio(bobEsponja, 2, 3, 20,
				"Placton tenta descobrir a fórmula secreta do hambúrguer de siri.", 1999, "Stephen Hillenburg");
		
		//Adicionando episódios à série
		bobEsponja.setEpisodio(t01e01);
		bobEsponja.setEpisodio(t01e02);
		bobEsponja.setEpisodio(t01e03);
		bobEsponja.setEpisodio(t02e01);
		bobEsponja.setEpisodio(t02e02);
		bobEsponja.setEpisodio(t02e03);
		
		mostrarDados(bobEsponja);
	}
	public static void mostrarDados(Serie serie) {
		System.out.println(serie.getNome());
		System.out.println("A série tem "+serie.qtdEpisodios()+" episódios e "+serie.getTemporadas()+" temporadas");
		System.out.println("Duração da série: "+serie.getDuracao()+" minutos.");
		System.out.println("Data de lançamento: "+serie.getAnoLancamento());
		System.out.println("Gênero: "+serie.getGenero());
		System.out.println("Sinopse: "+serie.getSinopse());
		System.out.println("Elenco: "+serie.elenco);
	}

}