package edu.univille.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.univille.api.model.Contato;
import edu.univille.api.repository.ContatoRepository;
import edu.univille.api.service.ContatoService;

@RestController
@RequestMapping(value = "/contatos")
public class ContatoController {
	
	@Autowired
	private ContatoService contatoService;
	
	@PostMapping
	public Contato sendMessage (@RequestBody Contato contato) {
		return contatoService.saveMsg(contato);
	}
	
	@GetMapping
	public ResponseEntity<List<Contato>> listar () {
		List<Contato> lista = contatoService.findAll();
		
		return ResponseEntity.ok(lista);
	}
	
}
