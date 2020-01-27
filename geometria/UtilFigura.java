package com.everis.becajava.springbootprueba.rest.geometria;

import java.util.ArrayList;
import java.util.List;

public class UtilFigura {

	public static List<IFigura> dummy() {
		List<IFigura> lista = new ArrayList<IFigura>();

		double radio = 1;
		lista.add(new Circulo(radio));

		double lado = 100.1;
		lista.add(new Cuadrado(lado));

		double base = 50;
		double altura = 4;
		lista.add(new Triangulo(base, altura));
		return lista;
	}

}
