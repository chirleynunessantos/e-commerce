package br.com.ecommerce.model;

import java.util.Collection;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "USUARIOS")
@Getter
@Setter

public class Usuario implements UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	private String login;

	private String email;

	private String senha;

	private UsuarioRole role;

	private Usuario(UsuarioBuilder usuarioBuilder) {
		super();
		this.id = usuarioBuilder.id;
		this.nome = usuarioBuilder.nome;
		this.login = usuarioBuilder.login;
		this.email = usuarioBuilder.email;
		this.senha = usuarioBuilder.senha;
		this.role = usuarioBuilder.role;
	}

	public static UsuarioBuilder builder() {
        return new UsuarioBuilder();
    }
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		if (this.role.equals(UsuarioRole.ADMIN))
			return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"), new SimpleGrantedAuthority("ROLE_USER"));
		return List.of(new SimpleGrantedAuthority("ROLE_USER"));
	}

	@Override
	public @Nullable String getPassword() {
		return senha;
	}

	@Override
	public String getUsername() {
		return login;
	}

	public static class UsuarioBuilder {

		private Long id;
		private String nome;
		private String login;
		private String email;
		private String senha;
		private UsuarioRole role;

		public UsuarioBuilder setId(Long id) {
			this.id = id;
			return this;
		}

		public UsuarioBuilder setNome(String nome) {
			this.nome = nome;
			return this;
		}

		public UsuarioBuilder setLogin(String login) {
			this.login = login;
			return this;
		}

		public UsuarioBuilder setEmail(String email) {
			this.email = email;
			return this;
		}

		public UsuarioBuilder setSenha(String senha) {
			this.senha = senha;
			return this;
		}

		public UsuarioBuilder setRole(UsuarioRole role) {
			this.role = role;
			return this;
		}

		public Usuario build() {
			return new Usuario(this);
		}

	}

}
