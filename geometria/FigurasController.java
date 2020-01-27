package com.everis.becajava.springbootprueba.rest.geometria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FigurasController {

	@Autowired
	FigurasService figurasServ;

	@GetMapping("/figuras")
	public String hola() {
		return "Hola figuras!";
	}

	@GetMapping("/figuras/calcularArea")
	public String calcularArea() {

		return figurasServ.areaTotal(UtilFigura.dummy());
	}

}
