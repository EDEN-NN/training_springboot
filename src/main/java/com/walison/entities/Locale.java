package com.walison.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.walison.entities.dto.ComplainDTO;

@Document
public class Locale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String name;
	private String uf;
	
	
	private List<ComplainDTO> complains = new ArrayList<>();
	
	
	public Locale() {
		super();
	}

	public Locale(String id, String name, String uf) {
		super();
		this.id = id;
		this.name = name;
		this.uf = uf;
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

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public List<ComplainDTO> getComplains() {
		return complains;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Locale other = (Locale) obj;
		return Objects.equals(id, other.id);
	}

}
