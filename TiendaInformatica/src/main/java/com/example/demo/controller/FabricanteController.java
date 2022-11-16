package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Fabricante;
import com.example.demo.service.FabricanteService;

@RestController
@RequestMapping("/fabricantes")
public class FabricanteController {

	private final FabricanteService service;
	
	public FabricanteController(FabricanteService service) {
		
		this.service = service;
		
	}
	
	@GetMapping
	public Iterable<Fabricante> list() {
		
		return service.list();
		
	}
	
	@GetMapping("/{cod}")
	public Fabricante find(@PathVariable("cod") int cod) {
		
		return service.find(cod);
		
	}
	
	@PostMapping
	public Fabricante create(@RequestBody Fabricante fabricante) {
		
		return service.save(fabricante);
		
	}
	
	@PutMapping("/{cod}")
	public Fabricante update(@PathVariable("cod") int cod, @RequestBody Fabricante fabricante) {
		
		return service.update(cod, fabricante);
		
	}
	
	@DeleteMapping("/{cod}")
	public boolean delete(@PathVariable("cod") int cod) {
		
		return service.delete(cod);
		
	}
	
}
