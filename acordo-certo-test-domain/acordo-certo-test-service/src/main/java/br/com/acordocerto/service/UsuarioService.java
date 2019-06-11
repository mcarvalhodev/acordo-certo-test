package br.com.acordocerto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.acordocerto.model.Usuario;
import br.com.acordocerto.repository.UsuarioRepository;

@Service
public class UsuarioService {

	private final UsuarioRepository repository;

	@Autowired
	public UsuarioService(UsuarioRepository repository) {
		this.repository = repository;
	}

	public Usuario save(Usuario usuario) {
		return repository.save(usuario);
	}
}
