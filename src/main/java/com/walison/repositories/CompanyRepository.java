package com.walison.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.walison.entities.Company;

public interface CompanyRepository extends MongoRepository<Company, String>{

}
