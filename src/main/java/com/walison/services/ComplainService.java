package com.walison.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walison.entities.Complain;
import com.walison.repositories.ComplainRepository;
import com.walison.services.exception.ObjectNotFoundException;

@Service
public class ComplainService {
	
	@Autowired
	ComplainRepository complainRepository;
	
	public List<Complain> findAll() {
		return complainRepository.findAll();
	}
	
	public Complain findById(String id) {
		Optional<Complain> obj = complainRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Id não encontrado!"));
	}
	
}
