
/* Nome: Henrique Borges de Almeida Filho
 * 3. Hora (sem data): incrementos e decrementos (em
segundos), impressão em tela em formato
curto e longo*/
import java.util.*;

public class Relogio {
	public int horas;
	public int minutos;
	public int segundos;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("1 - Insira as horas:");
		int h = entrada.nextInt();
		System.out.println("2 - Insira os minutos:");
		int m = entrada.nextInt();
		System.out.println("3 - Insira os segundos:");
		int s = entrada.nextInt();
		
		Relogio tempo = new Relogio(h, m, s);
		
		if (tempo.segundos == 60) {
			tempo.segundoMinuto();
		}
		if (tempo.minutos == 60) {
			tempo.minutoHora();
		}
		if (tempo.horas == 24) {
			tempo.hora24();
		}

		System.out.println(tempo.horas + ":" + tempo.minutos + ":" + tempo.segundos);
	}

	public void segundoMinuto() {
		segundos = 0;
		minutos += 1;
	}

	public void minutoHora() {
		minutos = 0;
		horas += 1;
	}

	public void hora24() {
		horas = 0;
	}

	public void incrementarSegundo() {
		segundos += 1;
	}

	Relogio(int hora, int minuto, int segundo) {
		this.horas = hora;
		this.minutos = minuto;
		this.segundos = segundo;
	}
}
