package com.william.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.william.cursomc.domain.Estado;

@Repository
public interface EstadoRepositorie extends JpaRepository<Estado, Integer> {
	
}
