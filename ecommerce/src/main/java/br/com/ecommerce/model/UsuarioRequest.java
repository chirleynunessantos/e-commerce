package br.com.ecommerce.model;

public record UsuarioRequest(
		 String nome,
		
		 String login,
		
		 String email,
		
		 String senha,
		
		 UsuarioRole role
		) {

}
