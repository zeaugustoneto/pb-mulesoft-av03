package br.com.sprint3.estados.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sprint3.estados.model.Estado;
import br.com.sprint3.estados.model.enums.Regiao;

public interface EstadoRepository extends JpaRepository<Estado, Long>{

	Page<Estado> findByRegiao(Regiao regiao, Pageable paginacao);


	
}
