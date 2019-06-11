package br.com.acordocerto.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.acordocerto.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
