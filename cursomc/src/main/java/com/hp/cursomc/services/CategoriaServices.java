package com.hp.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hp.cursomc.domain.Categoria;
import com.hp.cursomc.repositories.CategoriaRepository;

import com.hp.cursomc.services.exceptions.ObjectNotFoundException;



@Service
public class CategoriaServices {
	
	@Autowired
	CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Não existe categoria para esse código:" +id + " tipo:" + Categoria.class.getName()  );
		}
		return obj;
	}

}
