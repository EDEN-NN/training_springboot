package com.walison.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walison.entities.Complain;
import com.walison.repositories.ComplainRepository;

@Service
public class ComplainService {
	
	@Autowired
	ComplainRepository complainRepository;
	
	public List<Complain> findAll() {
		return complainRepository.findAll();
	}
	
}
