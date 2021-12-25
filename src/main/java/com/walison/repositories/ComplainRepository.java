package com.walison.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.walison.entities.Complain;

@Repository
public interface ComplainRepository extends MongoRepository<Complain, String>{

}
