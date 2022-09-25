package br.com.sprint3.estados.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.sprint3.estados.model.Estado;
import br.com.sprint3.estados.model.enums.Regiao;

public class EstadoForm {
	@NotNull @NotEmpty
	private String nome;
	@NotNull 
	private Regiao regiao;
	@NotNull 
	private int populacao;
	@NotNull @NotEmpty
	private String capital;
	@NotNull 
	private double area;
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Regiao getRegiao() {
		return regiao;
	}



	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}



	public int getPopulacao() {
		return populacao;
	}



	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}



	public String getCapital() {
		return capital;
	}



	public void setCapital(String capital) {
		this.capital = capital;
	}



	public double getArea() {
		return area;
	}



	public void setArea(double area) {
		this.area = area;
	}



	public Estado converter() {
		// TODO Auto-generated method stub
		return new Estado(nome, regiao, populacao, capital, area);
	}
}
