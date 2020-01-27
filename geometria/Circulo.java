package com.everis.becajava.springbootprueba.rest.geometria;

public class Circulo implements IFigura {

	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return (double) (Math.PI * Math.pow(radio, 2));
	}

}
