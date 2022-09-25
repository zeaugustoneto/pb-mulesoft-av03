package br.com.sprint3.estados.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sprint3.estados.model.Estado;
import br.com.sprint3.estados.model.enums.Regiao;

public interface EstadoRepository extends JpaRepository<Estado, Long>{

	List<Estado> findByRegiao(Regiao regiao);


	
}
