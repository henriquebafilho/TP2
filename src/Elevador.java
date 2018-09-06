
/*Nome: Henrique Borges de Almeida Filho
 * Projete classes para representar os seguintes
conceitos. Desta vez vocês irão decidir quais atributos
e métodos vocês vão modelar =)
6. Elevador*/
import java.util.*;

public class Elevador {
	public int andar;
	public int pessoas;
	public boolean porta;

	Elevador() {
		porta = false;
		pessoas = 0; // 6 max
		andar = 1; // 5 max
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
		
		System.out.println("Andar atual: "+ elev.andar);
		
		int passageiros = 0;
		int andarAlvo = 0;
		
		do {
			System.out.println("Insira o número de passageiros:");
			passageiros = entrada.nextInt();
			if(passageiros > 6) {
				System.out.println("A capacidade de passageiros foi excedida. Apenas 6 podem entrar");
			}
		}while (passageiros > 6);
		System.out.println("Digite o andar desejado:");
		andarAlvo = entrada.nextInt();
		
		if (andarAlvo == elev.andar) {
			System.out.println("Você já está nesse andar.");
		} else if (andarAlvo < 1 || andarAlvo > 5) {
			System.out.println("Andar Inválido. Insira um andar válido:");
		} else {
			elev.fecharPorta();
			System.out.println("Elevador andando...");
			elev.mudarAndar(andarAlvo);
			elev.abrirPorta();
			System.out.println("Andar atual: "+ elev.andar);
		}
		}
}
