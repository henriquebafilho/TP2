import java.util.Scanner;

public class Elevador {
	public int andar;
	public int pessoas;
	public boolean porta; // false aberta, true fechada

	Elevador() {
		porta = false;
		pessoas = 0; // máximo de 10 pessoas
		andar = 1; // 10 andares
	}

	public void mudarAndar(int andarAlvo) {
		andar = andarAlvo;
	}

	public void abrirPorta() {
		porta = false;
	}

	public void fecharPorta() {
		porta = true;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Elevador elev = new Elevador();
		System.out.println("Você está no andar " + elev.andar);
		int passageiros = 0;
		int andarAlvo = 0;
		int usarNovamente;
		boolean usarDeNovo = true;

		do {
			do {
				System.out.println("Insira o número de passageiros:");
				passageiros = entrada.nextInt();
				if (passageiros > 10)
					System.out.println("A capacidade de passageiros foi excedida. Apenas 10 pessoas podem entrar");
			} while (passageiros > 10);

			System.out.println("Digite o andar desejado:");
			andarAlvo = entrada.nextInt();

			if (andarAlvo == elev.andar) {
				System.out.println("Você já está nesse andar.");
			} else if (andarAlvo < 1 || andarAlvo > 10) {
				System.out.println("O andar inserido não existe no prédio");
			} else {
				elev.fecharPorta();
				System.out.println("Elevador em movimento...");
				elev.mudarAndar(andarAlvo);
				elev.abrirPorta();
				System.out.println("Andar atual: " + elev.andar);
				System.out.println("Deseja usar o elevador novamente? (0 - não / 1 - sim)");
				usarNovamente = entrada.nextInt();
				if(usarNovamente==0) {
					usarDeNovo = false;
				}
			}

		} while (elev.andar == andarAlvo && usarDeNovo);
		System.out.println("Obrigado por usar meu elevador ^^");
	}

}
