package edu.univille.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.univille.api.model.Contato;
import edu.univille.api.repository.ContatoRepository;

@Service
public class ContatoService {
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	public Contato saveMsg (Contato contato) {
		return contatoRepository.save(contato);
	}
	
	public List<Contato> findAll () {
		List<Contato> lista = contatoRepository.findAll();
		return lista;
	}

}
