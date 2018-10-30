package Lista03Exercicio07;

public class PoligonoRegular implements FormaGeometrica {
	int numLados;
	private double raio;
	private static double pi = 3.14;

	PoligonoRegular(int numLados) {
		this.numLados = numLados;
	}

	public double perimetro() {
		return numLados * lado();
	}

	public double area() {
		return (perimetro() * apotema()) / 2;
	}

	public double lado() {
		return 2 * raio * Math.sin(pi / raio);
	}

	public double apotema() {
		return raio * Math.cos(pi / raio);
	}

	@Override
	public String descricao() {
		switch (numLados) {
		case 3:
			return "tri�ngulo";
		case 4:
			return "quadr�ngulo";
		case 5:
			return "pent�gono";
		case 6:
			return "hex�gono";
		case 7:
			return "hept�gono";
		case 8:
			return "oct�gono";
		case 9:
			return "ene�gono";
		case 10:
			return "dec�gono";
		case 11:
			return "undec�gono";
		case 12:
			return "dodec�gono";
		case 15:
			return "pentadec�gono";
		case 20:
			return "icos�gono";
		default:
			return "O pol�gono n�o possui nome";
		}
	}
}