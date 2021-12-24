package com.walison.test;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.walison.entities.Company;
import com.walison.repositories.CompanyRepository;

@Configuration
public class MainTest implements CommandLineRunner{

	@Autowired
	CompanyRepository companyRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		companyRepository.deleteAll();
		
		Company company1 = new Company(null, "iFOod");
		Company company2 = new Company(null, "Habibs");
		companyRepository.saveAll(Arrays.asList(company1, company2));
	}
	
	
	
}
