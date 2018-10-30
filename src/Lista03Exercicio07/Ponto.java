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

	// b)Implemente nesta classe um m�todo est�tico dist que calcule a dist�ncia
	// entre dois pontos quaisquer.
	public static double dist(Ponto zero, Ponto um) {
		double distancia = Math.sqrt(Math.pow(zero.x - um.x, 2) + Math.pow(zero.y - um.y, 2));
		return distancia;
	}
}
