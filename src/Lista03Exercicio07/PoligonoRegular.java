package Lista03Exercicio07;

/*d)Crie uma classe PoligonoRegular para representar pol´ıgonos regulares utilizando esta
estrutura simplificada. Esta classe deve implementar a interface FormaGeometrica e os
objetos representados por esta classe devem possuir, al´em das informa¸c˜oes j´a listadas,
um nome.
Nesta classe, implemente os m´etodos adicionais lado() e apotema(), que calculam
o comprimento dos lados e dos ap´otemas do pol´ıgono regular.
 */

public class PoligonoRegular implements FormaGeometrica {
	private int numLados;
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
			return "triângulo";
		case 4:
			return "quadrângulo";
		case 5:
			return "pentágono";
		case 6:
			return "hexágono";
		case 7:
			return "heptágono";
		case 8:
			return "octógono";
		case 9:
			return "eneágono";
		case 10:
			return "decágono";
		case 11:
			return "undecágono";
		case 12:
			return "dodecágono";
		case 15:
			return "pentadecágono";
		case 20:
			return "icoságono";
		default:
			return "O polígono não possui nome";
		}
	}
}