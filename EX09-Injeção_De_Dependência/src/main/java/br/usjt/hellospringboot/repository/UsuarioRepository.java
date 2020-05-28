package br.usjt.hellospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.hellospringboot.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
public Usuario findOneByLoginAndSenha (String login, String senha);

}