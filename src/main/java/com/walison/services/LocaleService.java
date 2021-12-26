package com.walison.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walison.entities.Locale;
import com.walison.repositories.LocaleRepository;
import com.walison.services.exception.ObjectNotFoundException;

@Service
public class LocaleService {
	
	@Autowired
	LocaleRepository repository;
	
	public List<Locale> findByLocale(String uf) {
		List<Locale> list = repository.findByUfContainingIgnoreCase(uf);
		return list;
	}
	
	public Locale insert(Locale locale) {
		return repository.insert(locale);
	}
	
	public Locale update (Locale locale) {
		Optional<Locale> oldLocale = repository.findById(locale.getId());
		if(oldLocale == null) {
			throw new ObjectNotFoundException("Local não encontrado!");
		}
		Locale newLocale = new Locale();
		newLocale.setId(locale.getId());
		newLocale.setName(locale.getName());
		newLocale.setUf(locale.getUf());
		return repository.save(newLocale);
	}
	
	public void delete(String id) {
		repository.deleteById(id);
	}
	
	
}
