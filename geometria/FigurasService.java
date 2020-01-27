package com.everis.becajava.springbootprueba.rest.geometria;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FigurasService {

	public String areaTotal(List<IFigura> listaFiguras) {

		double total = 0;
		for (IFigura f : listaFiguras) {
			total += f.calcularArea();
		}
		return "Área total: " + total;
	}

}
