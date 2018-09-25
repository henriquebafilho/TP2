package Aula07Exercicio04;

import java.util.Random;

//Feito por João Victor Antunes Figueira, Leonardo Vartuli Negreiros, Henrique Borges de Almeida Filho

public class Partida {

	protected int GolsA = 0;
	protected int GolsB = 0;
	protected Time A;
	protected Time B;
	protected Time Vencedor;

	// METODOS

	// PARTIDAS COM RESULTADOS RANDÔMICOS
	protected void jogar() {
		System.out.println("Partida de time " + A.Nome + " Contra " + B.Nome);
		int jogo;
		// EM 11 TICKS DO FOR ELE RANDOMIZARA UM NUMERO
		// CASO O NUMERO SEJA 1 GOL DO TIME A
		// CASO O NUMERO SEJA 2 GOL DO TIME B
		// CASO O NUMERO SEJA QQ OUTRO NAO ACONTECE NADA
		// PERMITE EMPATES
		Random rand = new Random();
		for (int i = 0; i < 11; i++) {
			jogo = rand.nextInt(5) + 1;
			switch (jogo) {

			case 1:
				this.GolTimeA();
				break;

			case 2:
				this.GolTimeB();
				break;

			}
		}
		this.FimPartida();
	}

	private void GolTimeA() {
		GolsA += 1;
		System.out.println("GOOOOOLLLL DO " + A.Nome);
	}

	private void GolTimeB() {
		GolsB += 1;
		System.out.println("GOOOOOOOLLLL DO " + B.Nome);
	}

	private void FimPartida() {
		// CASO SEJA EMPATE OCORRE O PENALTE
		// NO PENALTE É RANDOMIZADO OUTRO NUMERO DE 1 ATE 50
		// CASO O NUMERO SEJA PAR VITORIA DO TIME A
		// CASO O NUMERO SEJA IMPAR VITORIA DO TIME B
		if (this.GolsA == this.GolsB) {
			System.out.println("PENALTE");
			Random rand = new Random();
			int penalte = rand.nextInt(50) + 1;
			if (penalte % 2 == 0) {
				this.GolTimeA();
			} else {
				this.GolTimeB();
			}

		}

		if (this.GolsA > this.GolsB) {
			System.out.println("Vencedor Time " + A.Nome + " " + GolsA + "x" + GolsB);
			Vencedor = A;
		} else if (this.GolsA < this.GolsB) {
			System.out.println("Vencedor Time " + B.Nome + " " + GolsB + "x" + GolsA);
			Vencedor = B;
		}
	}

	// CONTRUTOR DA PARTIDA
	Partida(Time a, Time b) {
		A = a;
		B = b;
	}
}
