package br.com.ecommerce.dto;

import br.com.ecommerce.model.UsuarioRole;

public record UsuarioRequest(
		 String nome,
		
		 String login,
		
		 String email,
		
		 String senha,
		
		 UsuarioRole role
		) {

}
