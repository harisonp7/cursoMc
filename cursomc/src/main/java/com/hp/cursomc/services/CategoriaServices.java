package com.hp.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hp.cursomc.domain.Categoria;
import com.hp.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaServices {
	
	@Autowired
	CategoriaRepository repo;
	

	
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		return obj;
	}

}