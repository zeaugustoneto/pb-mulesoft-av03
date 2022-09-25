package br.com.sprint3.estados.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sprint3.estados.controller.dto.UsuarioDto;
import br.com.sprint3.estados.model.Usuario;
import br.com.sprint3.estados.repository.UsuarioRepository;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@RequestMapping("/api/v1/usuarios")
	public List<UsuarioDto> lista(){
		List<Usuario> usuarios = usuarioRepository.findAll();
		return UsuarioDto.converter(usuarios);
	}
	
}
