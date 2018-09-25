package Aula07Exercicio04;

import java.util.*;
//Feito por João Victor Antunes Figueira, Leonardo Vartuli Negreiros, Henrique Borges de Almeida Filho

public class Campeonato {

	private Time Vencedor;
	private ArrayList<Time> Times = new ArrayList<Time>();
	private ArrayList<Time> Vencedores = new ArrayList<Time>();

	// METODOS

	protected void AdicionarTime() {
		Scanner entrada = new Scanner(System.in);
		Time novo = new Time("nada");
		novo.main(novo);
		this.Times.add(novo);
	}

	protected void jogar(Time A, Time B) {
		Partida partida = new Partida(A, B);
		partida.jogar();
		for (int i = 0; i < Times.size(); i++) {
			if (partida.Vencedor.Nome.equals(Times.get(i).Nome)) {
				Vencedores.add(Times.get(i));
			}
		}
	}

	// Controle principal do campeonato
	// Só pode adicionar 2^n times por vez, nada de campeonato com numero de times
	// impares
	public static void main(String[] args) {
		int continuar;
		int aux = 0;
		Scanner entrada = new Scanner(System.in);
		Campeonato CopaPistao = new Campeonato();
		System.out.println("Bem vindo a Copa Pistão");
		System.out.println("Insira o primeiro par de times");
		CopaPistao.AdicionarTime();
		CopaPistao.AdicionarTime();
		while (aux == 0) {
			System.out.println("Deseja inserir mais times ? 0 para nao 1 para sim");

			continuar = entrada.nextInt();
			if (continuar == 1) {
				CopaPistao.AdicionarTime();
				CopaPistao.AdicionarTime();
			} else if (continuar == 0) {
				break;
			} else {
				System.out.println("Opção invalida tente novamente");
			}
		}

		while (CopaPistao.Times.size() != 1) {

			int aux2 = CopaPistao.Times.size();
			for (int i = 0; i < (aux2 / 2); i++) {
				System.out.println("Partida numero " + (i + 1));
				CopaPistao.jogar(CopaPistao.Times.get(i), CopaPistao.Times.get(CopaPistao.Times.size() - i - 1));
			}
			// Rodada Final
			if (aux2 == 2) {
				System.out.println("Vencedor do Campeonato foi " + CopaPistao.Vencedores.get(0).Nome);
				break;
				// Outras Rodadas
			} else {

				CopaPistao.Times.clear();
				;

				for (int i = 0; i < CopaPistao.Vencedores.size(); i++) {
					CopaPistao.Times.add(CopaPistao.Vencedores.get(i));
				}

				CopaPistao.Vencedores.clear();

			}
		}

	}
}
