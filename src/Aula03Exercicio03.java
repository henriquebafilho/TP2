
/*3. Hora (sem data): incrementos e decrementos (em
segundos), impressão em tela em formato curto e longo*/
import java.util.*;

public class Aula03Exercicio03 {
	public static void main(String[] args) {
		int horas = 0, minutos = 0, segundos = 0;
		
		while(minutos < 2) {
			segundos += 1;
			if(segundos==60) {
				segundos = 0;
				minutos += 1;
			}
			if(minutos == 60) {
				minutos = 0;
				horas += 1;
			}
			System.out.println(horas+":"+minutos+":"+segundos);
		}
	}

}
