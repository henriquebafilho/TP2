package Lista03Exercicio07;

import java.util.*;
import java.lang.*;

//a)Crie uma classe Ponto para representar pontos em R^2, com coordenadas reais.
public class Ponto implements FormaGeometrica {
	double x, y;

	Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	double perimetro() {

	}

	double area() {

	}

	String descricao(int numLados) {
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

	// b)Implemente nesta classe um método estático dist que calcule a distância
	// entre dois pontos quaisquer.
	public static double dist(Ponto zero, Ponto um) {
		double distancia = Math.sqrt(Math.pow(zero.x - um.x, 2) + Math.pow(zero.y - um.y, 2));
		return distancia;
	}
}
