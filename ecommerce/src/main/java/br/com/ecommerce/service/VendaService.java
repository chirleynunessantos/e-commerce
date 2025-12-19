package br.com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecommerce.repository.VendaRepository;

@Service
public class VendaService {

	@Autowired
	VendaRepository repository;
}
