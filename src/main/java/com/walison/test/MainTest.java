package com.walison.test;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.walison.entities.Company;
import com.walison.entities.Complain;
import com.walison.repositories.CompanyRepository;
import com.walison.repositories.ComplainRepository;

@Configuration
public class MainTest implements CommandLineRunner{

	@Autowired
	CompanyRepository companyRepository;
	
	@Autowired
	ComplainRepository complainRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		companyRepository.deleteAll();
		
		Company company1 = new Company(null, "iFOod");
		Company company2 = new Company(null, "Habibs");
		
		
		complainRepository.deleteAll();
		
		Complain c1 = new Complain(null, "Não recebi meu produto", "Fiz uma aquisição no dia 23 e ainda não recebi!", null, company1);
		Complain c2 = new Complain(null, "Produto veio errado", "Pedi carne e veio frango", null, company1);
		Complain c3 = new Complain(null, "Não recebi meu estorno", "Paguei por 4 esfihas sendo que comi 2", null, company2);
		Complain c4 = new Complain(null, "Esfiha estragada", "MInha esfiha veio podre", null, company2);
		
		complainRepository.saveAll(Arrays.asList(c1, c2, c3, c4));
		
		company1.getComplains().addAll(Arrays.asList(c1, c2));
		company2.getComplains().addAll(Arrays.asList(c3, c4));
		
		
		companyRepository.saveAll(Arrays.asList(company1, company2));
	}
	
	
	
}
