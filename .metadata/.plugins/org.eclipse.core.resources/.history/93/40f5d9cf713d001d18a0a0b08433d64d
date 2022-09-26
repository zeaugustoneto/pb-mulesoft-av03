package br.com.sprint3.estados.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

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

	public static List<UsuarioDto> converter(List<Usuario> usuarios) {
		// TODO Auto-generated method stub
		
		return usuarios.stream().map(UsuarioDto::new).collect(Collectors.toList());
	}

	
	
}
