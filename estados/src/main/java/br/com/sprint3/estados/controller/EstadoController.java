package br.com.sprint3.estados.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.sprint3.estados.controller.dto.EstadoDto;
import br.com.sprint3.estados.controller.form.AtualizacaoEstadoForm;
import br.com.sprint3.estados.controller.form.EstadoForm;
import br.com.sprint3.estados.model.Estado;
import br.com.sprint3.estados.model.enums.Regiao;
import br.com.sprint3.estados.repository.EstadoRepository;

@RestController
@RequestMapping("/api/v1/estados")
public class EstadoController {
	@Autowired
	private EstadoRepository estadoRepository;

	@GetMapping	
	public List<EstadoDto> lista(Regiao regiao) {

		if (regiao == null) {
			List<Estado> estados = estadoRepository.findAll();

			return EstadoDto.converter(estados);

		} else {
			List<Estado> estados = estadoRepository.findByRegiao(regiao);

			return EstadoDto.converter(estados);
		}

	}
	
	
    @GetMapping("/{id}")
    public  ResponseEntity<EstadoDto> listaId(@PathVariable Long id){
        Optional<Estado> estado = estadoRepository.findById(id);
        
        if(estado.isPresent()) {
        	return ResponseEntity.ok(new EstadoDto(estado.get()));
        }
        
        return ResponseEntity.notFound().build();
    }
	
	
	//dto -> dados que saem da api e vão pro cliente
	//form -> dados chegam do cliente e vão pra api

	@PostMapping
	@Transactional
	public ResponseEntity<EstadoDto> cadastrar(@RequestBody @Valid EstadoForm form, UriComponentsBuilder uriBuilder) {
		Estado estado = form.converter();
		estadoRepository.save(estado);
		
		URI uri = uriBuilder.path("/api/v1/estados/{id}").buildAndExpand(estado.getId()).toUri();
		return ResponseEntity.created(uri).body(new EstadoDto(estado));
		
	}
	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<EstadoDto> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizacaoEstadoForm form){
		Estado estado = form.atualizar(id,estadoRepository);
	
		return ResponseEntity.ok(new EstadoDto(estado));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
