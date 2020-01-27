package com.everis.becajava.springbootprueba.rest.usuarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuariosRepo;

	@Autowired
	private ListarService listaService;

	@GetMapping("/hola")
	public String hola() {
		return "Hola!";
	}

	@GetMapping("/usuarios")
	public List<Usuario> obtenerUsuarios() {
		return usuariosRepo.findAll();
	}

	@GetMapping("/usuarios/{name}")
	public Usuario obtener(@PathVariable("name") String name) {
		return usuariosRepo.findByUserName(name);
	}

	@GetMapping("/lista")
	public void listar() {
		listaService.listar();
	}

}
