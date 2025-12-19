package br.com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecommerce.model.Cliente;
import br.com.ecommerce.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository cliente;
	
	public void salvar(Cliente cliente) {
		
	}
}
