
import java.util.*;

public class Baralho {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int naipe, numero;

		System.out.println("Insira um número que represente o naipe da sua carta:");
		System.out.println("1 - Copas");
		System.out.println("2 - Espadas");
		System.out.println("3 - Ouros");
		System.out.println("4 - Paus");
		naipe = entrada.nextInt();

		System.out.println("Insira o valor da sua carta:");
		System.out.println("Cartas especiais: (1 - A, 11 - J, 12 - Q, 13 - K)");
		numero = entrada.nextInt();

		Carta(naipe,numero);
	}
	public static void Carta(int n, int v) {
		if((n < 1) || (n > 4)) {
			throw new IllegalArgumentException( "Naipe inválido" );
		}else if((v<1)||(v>13)) {
			throw new IllegalArgumentException( "Nome inválido" );
		}else {
			System.out.println(retorNaipe(n)+" - "+retornaValor(v));
		}
	}

	public enum Naipe {

		COPAS(1, "Copas"), ESPADAS(2, "Espadas"), OUROS(3, "Ouros"), PAUS(4, "Paus");

		private int valor;
		private String naipe;

		Naipe(int valor, String naipe) {
			this.valor = valor;
			this.naipe = naipe;
		}

		public int getValor() {
			return valor;
		}

		public String getNaipe() {
			return naipe;
		}
	}

	public static String retorNaipe(int n) {
		String retornaNaipe = new String();

		for (Naipe meuNaipe : Naipe.values()) {
			if (meuNaipe.getValor() == n) {
				retornaNaipe = meuNaipe.getNaipe();
			}
		}
		return retornaNaipe;
	}

	public enum Valor {
		AS(1, "A"), DOIS(2, "2"), TRES(3, "3"), QUATRO(4, "4"), CINCO(5, "5"), SEIS(6, "6"), SETE(7, "7"), OITO(8,
				"8"), NOVE(9, "9"), DEZ(10, "10"), VALETE(11, "J"), RAINHA(12, "Q"), REI(13, "K");

		private int valor;
		private String nome;

		Valor(int valor, String nome) {
			this.valor = valor;
			this.nome = nome;
		}

		public int getValor() {
			return valor;
		}

		public String getNome() {
			return nome;
		}
	}

	public static String retornaValor(int v) {
		String retornaValue = new String();

		for (Valor meuValor : Valor.values()) {
			if (meuValor.getValor() == v) {
				retornaValue = meuValor.getNome();
			}
		}
		return retornaValue;
	}
}
