import java.util.Scanner;

public class Relogio {
	public int horas;
	public int minutos;
	public int segundos;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Coloque a hora atual:");
		int h = scan.nextInt();
		int m = scan.nextInt();
		int s = scan.nextInt();
		Relogio tempo = new Relogio(h, m, s);
		if (tempo.segundos == 60)
			tempo.segundoMinuto();
		if (tempo.minutos == 60)
			tempo.minutoHora();
		if (tempo.horas == 24)
			tempo.hora24();

		System.out.println(tempo.horas + ":" + tempo.minutos + ":" + tempo.segundos);
		System.out.println(tempo.horas + ":" + tempo.minutos);
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

	public void incrementoSegundo() {
		segundos += 1;
	}

	Relogio(int hora, int minuto, int segundo) {
		this.horas = hora;
		this.minutos = minuto;
		this.segundos = segundo;
	}

}
