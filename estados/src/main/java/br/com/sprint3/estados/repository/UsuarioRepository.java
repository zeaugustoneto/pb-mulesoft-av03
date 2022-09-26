package br.com.sprint3.estados.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sprint3.estados.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	//interface tbm para autenticação
	Optional<Usuario> findByEmail(String email);
}
