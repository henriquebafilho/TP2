package Lista03Exercicio02;

import java.util.*;

public class principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> elenco = new ArrayList();
		ArrayList<Episodio> episodios = new ArrayList();

		// Criando a s�rie
		Serie bobEsponja = new Serie("Bob Esponja", "Uma esponja que vive no mar e veste uma cal�a quadrada.", 1999,
				"com�dia", 2, elenco, episodios);

		// Setando elenco da s�rie
		bobEsponja.setElenco("Bob Esponja");
		bobEsponja.setElenco("Patrick");
		bobEsponja.setElenco("Sr. Siriguejo");
		bobEsponja.setElenco("Lula Molusco");
		bobEsponja.setElenco("Sandy");
		bobEsponja.setElenco("Plancton");

		// Criando episodios
		Episodio t01e01 = new Episodio(bobEsponja, 1, 1, 20, "Bob Esponja vai trabalhar no Siri Cascudo.", 1999,
				"Stephen Hillenburg");
		Episodio t01e02 = new Episodio(bobEsponja, 1, 2, 20, "Bob Esponja vai � casa de Patrick.", 1999,
				"Stephen Hillenburg");
		Episodio t01e03 = new Episodio(bobEsponja, 1, 3, 20, "Bob Esponja conhece Sandy.", 1999, "Stephen Hillenburg");
		Episodio t02e01 = new Episodio(bobEsponja, 2, 1, 20, "Bob Esponja vai ca�ar algas-vivas.", 1999,
				"Stephen Hillenburg");
		Episodio t02e02 = new Episodio(bobEsponja, 2, 2, 20,
				"Placton tenta descobrir a f�rmula secreta do hamb�rguer de siri.", 1999, "Stephen Hillenburg");
		Episodio t02e03 = new Episodio(bobEsponja, 2, 3, 20,
				"Placton tenta descobrir a f�rmula secreta do hamb�rguer de siri.", 1999, "Stephen Hillenburg");
		
		//Adicionando epis�dios � s�rie
		bobEsponja.setEpisodio(t01e01);
		bobEsponja.setEpisodio(t01e02);
		bobEsponja.setEpisodio(t01e03);
		bobEsponja.setEpisodio(t02e01);
		bobEsponja.setEpisodio(t02e02);
		bobEsponja.setEpisodio(t02e03);
		
		System.out.println("Dura��o da s�rie "+bobEsponja.getNome()+" : "+bobEsponja.getDuracao()+" minutos.");
	}

}