package Lista03Exercicio07;

/* Crie uma classe Circulo que tamb´em implemente a interface FormaGeometrica. Utilize
as f´ormulas tradicionais para o c´alculo de seu per´ımetro e ´area.*/

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
