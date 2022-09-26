package br.com.sprint3.estados.controller.dto;

import org.springframework.data.domain.Page;

import br.com.sprint3.estados.model.Usuario;

public class UsuarioDto {

	private Long id;
	private String nome;
	private String email;
	private String senha;

	public UsuarioDto(Usuario usuario) {
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.senha = usuario.getSenha();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}
	
	public String getSenha() {
		return senha;
	}

	public static Page<UsuarioDto> converter(Page<Usuario> usuarios) {
		// TODO Auto-generated method stub
		
		return usuarios.map(UsuarioDto::new);
	}

	
	
}
