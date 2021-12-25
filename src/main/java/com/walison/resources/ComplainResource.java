package com.walison.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.walison.entities.Complain;
import com.walison.services.ComplainService;

@RestController
@RequestMapping(value = "/api/complains")
public class ComplainResource {
	
	@Autowired
	ComplainService service;
	
	@GetMapping
	public ResponseEntity<List<Complain>> findAll() {
		List<Complain> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
}
