package br.com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecommerce.model.Usuario;
import br.com.ecommerce.model.UsuarioRequest;
import br.com.ecommerce.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioService service;

	@PostMapping
	public ResponseEntity<String> salvar(@RequestBody UsuarioRequest request) {

		Usuario usuario =   Usuario.builder()
		.setEmail(request.email())
		.setLogin(request.login())
		.setNome(request.nome())
		.setSenha(request.senha())
		.setRole(request.role())
		.build();
		
		service.salvar(usuario);

		return ResponseEntity.ok().build();
	}

	@GetMapping
	public ResponseEntity<List<Usuario>> findAll() {

		return ResponseEntity.ok(service.findAll());
	}
}
