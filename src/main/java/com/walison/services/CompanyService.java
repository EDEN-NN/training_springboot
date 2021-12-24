package com.walison.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walison.entities.Company;
import com.walison.repositories.CompanyRepository;
import com.walison.services.exception.ObjectNotFoundException;

@Service
public class CompanyService {
	
	@Autowired
	CompanyRepository repository;
	
	public List<Company> findAll() {
		return repository.findAll();
	}
	
	public Company findById(String id) {
		Optional<Company> company = repository.findById(id);
		return company.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
		}
	
	public Company insert(Company company) {
		return repository.insert(company);
	}
	
	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}
	public void update(Company company) {
		Company newObj = findById(company.getId());
		updateData(newObj, company);
		repository.save(newObj);
	}

	private void updateData(Company newObj, Company company) {
		newObj.setName(company.getName());
		newObj.setComplains(company.getComplains());
	}
	
	
	
}
