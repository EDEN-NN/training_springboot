package com.walison.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.walison.entities.Locale;

public interface LocaleRepository extends MongoRepository<Locale, String>{
	
	@Query("{ uf: { $regex: ?0 , $options: 'i' } }")
	List<Locale> findByUfContainingIgnoreCase(String locale);
	
}
