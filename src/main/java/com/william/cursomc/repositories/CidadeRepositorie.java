package com.william.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.william.cursomc.domain.Cidade;

@Repository
public interface CidadeRepositorie extends JpaRepository<Cidade, Integer> {
	
}
