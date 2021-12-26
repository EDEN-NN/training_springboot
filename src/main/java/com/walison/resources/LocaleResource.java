package com.walison.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.walison.entities.Locale;
import com.walison.services.LocaleService;

@RestController
@RequestMapping(value = "/api/locale")
public class LocaleResource {
	
	@Autowired
	LocaleService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<List<Locale>> findByLocale(@PathVariable String id) {
		List<Locale> list = service.findByLocale(id);
		return ResponseEntity.ok().body(list);
	}
	
}
