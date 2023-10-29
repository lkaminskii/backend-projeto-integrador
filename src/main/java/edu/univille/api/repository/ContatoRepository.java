package edu.univille.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.univille.api.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{

}
