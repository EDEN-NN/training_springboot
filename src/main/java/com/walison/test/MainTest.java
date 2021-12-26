package com.walison.test;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.walison.entities.Company;
import com.walison.entities.Complain;
import com.walison.entities.Locale;
import com.walison.entities.dto.CompanyDTO;
import com.walison.entities.dto.ComplainDTO;
import com.walison.repositories.CompanyRepository;
import com.walison.repositories.ComplainRepository;
import com.walison.repositories.LocaleRepository;

@Configuration
public class MainTest implements CommandLineRunner{

	@Autowired
	CompanyRepository companyRepository;
	
	@Autowired
	ComplainRepository complainRepository;
	
	@Autowired
	LocaleRepository localeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		companyRepository.deleteAll();
		localeRepository.deleteAll();
		
		Locale locale1 = new Locale(null, "São Paulo", "SP");
		Locale locale2 = new Locale(null, "Rio de Janeiro", "RJ");
		
		localeRepository.saveAll(Arrays.asList(locale1, locale2));
		
		Company company1 = new Company(null, "iFOod", locale1);
		Company company2 = new Company(null, "Habibs", locale2);
		
		
		companyRepository.saveAll(Arrays.asList(company1, company2));
		
		complainRepository.deleteAll();
		
		Complain c1 = new Complain(null, "Não recebi meu produto", "Fiz uma aquisição no dia 23 e ainda não recebi!", company1.getLocale(), new CompanyDTO(company1));
		Complain c2 = new Complain(null, "Produto veio errado", "Pedi carne e veio frango", company1.getLocale(), new CompanyDTO(company1));
		Complain c3 = new Complain(null, "Não recebi meu estorno", "Paguei por 4 esfihas sendo que comi 2", company2.getLocale(), new CompanyDTO(company2));
		Complain c4 = new Complain(null, "Esfiha estragada", "MInha esfiha veio podre", company2.getLocale(), new CompanyDTO(company2));
		
		complainRepository.saveAll(Arrays.asList(c1, c2, c3, c4));
		
		company1.getComplains().addAll(Arrays.asList(c1, c2));
		company2.getComplains().addAll(Arrays.asList(c3, c4));
		
		locale1.getComplains().addAll(Arrays.asList(new ComplainDTO(c1), new ComplainDTO(c2)));
		locale2.getComplains().addAll(Arrays.asList(new ComplainDTO(c3), new ComplainDTO(c4)));
		localeRepository.saveAll(Arrays.asList(locale1, locale2));
		
		companyRepository.saveAll(Arrays.asList(company1, company2));
	}
	
	
	
}
