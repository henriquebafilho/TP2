public class Racional {
	private int numerador;
	private int denominador;

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	public void imprimirFracao() {
		if (denominador == 1) {
			System.out.println(numerador);
		} else if (denominador == 0) {
			System.out.println("Não é possível dividir um número por zero.");
		} else {
			System.out.println(numerador + "/" + denominador);
		}
	}

	public void imprimirDecimal() {
		System.out.println(numerador * 1.0 / denominador);
	}

	public void incrementar(Racional incremento) {
		int novoNumerador = numerador * incremento.denominador + incremento.numerador * denominador;
		int novoDenominador = denominador * incremento.denominador;

		numerador = novoNumerador;
		denominador = novoDenominador;
	}

	public static void dividir(Racional num, Racional den) {
		int zerar = 0;
		try {
			if (num.getDenominador() == 0 || den.getNumerador() == 0)
				zerar /= zerar;

			int novoNumerador = num.getNumerador() * den.getDenominador();
			int novoDenominador = num.getDenominador() * den.getDenominador();

			num.setNumerador(novoNumerador);
			num.setDenominador(novoDenominador);
		} catch (Exception ArithmeticException) {
			System.out.println("Não é possível dividir por zero");
		}
	}

	public static void main(String[] args) {
		Racional numeroLegal = new Racional();
		numeroLegal.setNumerador(3);
		numeroLegal.setDenominador(5);
		
		Racional numeroBolado = new Racional();
		numeroBolado.setNumerador(1);
		numeroBolado.setDenominador(3);
		
		numeroLegal.imprimirFracao();
		numeroLegal.imprimirDecimal();
		System.out.println("------------------------");
		numeroBolado.imprimirFracao();
		numeroBolado.imprimirDecimal();
		System.out.println("------------------------");
		numeroLegal.incrementar(numeroBolado);
		numeroLegal.imprimirFracao();
		numeroBolado.imprimirFracao();
	}
}