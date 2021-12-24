package com.walison.entities;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Complain implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String title;
	private String description;
	private String locale;
	private Company company;
	
	public Complain() {}

	public Complain(String title, String description, String locale, Company company) {
		super();
		this.title = title;
		this.description = description;
		this.locale = locale;
		this.company = company;
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

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	
	
}
