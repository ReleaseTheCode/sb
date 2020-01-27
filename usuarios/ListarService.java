package com.everis.becajava.springbootprueba.rest.usuarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ListarService {

	public void listar() {

		List<String> lista = new ArrayList<>();
		lista.add("hola2");
		lista.add("hola3");
		lista.add("hola1");
		lista.add("hola0");

		// ordenar lista
		Collections.sort(lista);
		for (String str : lista) {
			System.out.println(str);
		}

	}

}
