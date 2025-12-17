package br.com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecommerce.model.Usuario;
import br.com.ecommerce.repository.UsuarioRepository;


@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository repository;
	
	public void salvar(Usuario usuario) {
		repository.save(usuario);
	}

	public List<Usuario> findAll() {
		
		return repository.findAll();
	}

	
}
