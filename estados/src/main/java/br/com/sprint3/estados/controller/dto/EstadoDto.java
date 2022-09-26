package br.com.sprint3.estados.controller.dto;

import java.util.stream.Collectors;

import org.springframework.data.domain.Page;

import br.com.sprint3.estados.model.Estado;
import br.com.sprint3.estados.model.enums.Regiao;

public class EstadoDto {
	
	private Long id;
	private String nome;
	private Regiao regiao;
	private int populacao;
	private String capital;
	private double area;
	
	public EstadoDto(Estado estado) {
		
		this.id = estado.getId();
		this.nome = estado.getNome();
		this.regiao = estado.getRegiao();
		this.populacao = estado.getPopulacao();
		this.capital = estado.getCapital();
		this.area = estado.getArea();
	}
	
	

	public Long getId() {
		return id;
	}



	public String getNome() {
		return nome;
	}



	public Regiao getRegiao() {
		return regiao;
	}



	public int getPopulacao() {
		return populacao;
	}



	public String getCapital() {
		return capital;
	}



	public double getArea() {
		return area;
	}



	public static Page<EstadoDto> converter(Page<Estado> estados) {
		// TODO Auto-generated method stub
		return estados.map(EstadoDto::new);
	}
	
	
	
	
}
