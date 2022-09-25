package br.com.sprint3.estados.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sprint3.estados.controller.dto.EstadoDto;
import br.com.sprint3.estados.model.Estado;
import br.com.sprint3.estados.model.enums.Regiao;

@RestController
public class EstadoController {

@RequestMapping("/api/v1/estados")	
	public List<EstadoDto> lista(){
	Estado estado = new Estado("Rio Grande do Norte", Regiao.Nordeste , 3409000, "Natal", 52.797);
	
	return EstadoDto.converter(Arrays.asList(estado,estado,estado,estado));
		
	}

}
