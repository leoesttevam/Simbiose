package br.com.simbiose.web.service;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.simbiose.web.model.Usuario;
import br.com.simbiose.web.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired UsuarioRepository repo;
	
	public Usuario buscar(Integer id) {
		Optional<Usuario> user = repo.findById(id);
		
		return user.orElseThrow(() -> new ObjectNotFoundException(id + ", Tipo: " +Usuario.class.getName(), "Objeto não encontrado! Id: " + id));
	}
}
