package br.com.sprint3.estados.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sprint3.estados.controller.dto.UsuarioDto;
import br.com.sprint3.estados.model.Usuario;

@RestController
public class UsuarioController {

	@RequestMapping("/api/v1/usuarios")
	public List<UsuarioDto> lista(){
		Usuario usuario = new Usuario("Fulano de Tal", "fulanodetal@gmail.com", "1234fdsert");
		return UsuarioDto.converter(Arrays.asList(usuario,usuario,usuario));
	}
	
}
