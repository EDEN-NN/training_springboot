package com.walison.entities.dto;

import java.io.Serializable;

import com.walison.entities.Company;

public class CompanyDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	
	public CompanyDTO() {}
	
	public CompanyDTO(Company company) {
		id = company.getId();
		name = company.getName();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
