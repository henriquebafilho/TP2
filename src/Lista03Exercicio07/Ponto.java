package Lista03Exercicio07;

import java.util.*;
import java.lang.*;

//a)Crie uma classe Ponto para representar pontos em R^2, com coordenadas reais.
public class Ponto{
	double x, y;

	Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// b)Implemente nesta classe um método estático dist que calcule a distância
	// entre dois pontos quaisquer.
	public static double dist(Ponto zero, Ponto um) {
		double distancia = Math.sqrt(Math.pow(zero.x - um.x, 2) + Math.pow(zero.y - um.y, 2));
		return distancia;
	}
}
