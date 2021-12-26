package com.walison.entities.dto;

import com.walison.entities.Complain;

public class ComplainDTO {
	
	private String id;
	private CompanyDTO company;
	
	public ComplainDTO () {}

	public ComplainDTO(Complain complain) {
		id = complain.getId();
		company = complain.getCompany();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public CompanyDTO getCompany() {
		return company;
	}

	public void setCompany(CompanyDTO company) {
		this.company = company;
	}
	
	
	
}
