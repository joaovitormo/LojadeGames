package br.org.generation.lojaGames.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.lojaGames.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
	public Optional<Usuario> findByUsuario(String usuario);

}
