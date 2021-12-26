package com.walison.entities;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.walison.entities.dto.CompanyDTO;

@Document
public class Complain implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String title;
	private String description;
	private Locale locale;
	private CompanyDTO company;
	
	public Complain() {}

	public Complain(String id, String title, String description, Locale locale, CompanyDTO company) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.locale = locale;
		this.company = company;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public CompanyDTO getCompany() {
		return company;
	}

	public void setCompany(CompanyDTO company) {
		this.company = company;
	}
	
	
	
}
