package Lista03Exercicio07;

public class Circulo implements FormaGeometrica {

	private double raio;
	private static double pi = 3.14;

	public String descricao() {
		return "O Circulo é uma forma geometrica sem vertices";
	}

	public double area() {
		return this.pi * this.raio * this.raio;
	}

	public double perimetro() {
		return 2 * this.pi * this.raio;
	}
	
	public double lado() {
		return 2 * raio * Math.sin(pi / raio);
	}
	
	public double apotema() {
		return raio * Math.cos(pi / raio);
	}

}
