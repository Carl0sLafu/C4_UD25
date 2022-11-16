package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Articulo;
import com.example.demo.service.ArticulosService;

@RestController
@RequestMapping("/articulos")
public class ArticuloController {

	private final ArticulosService service;
	
	public ArticuloController(ArticulosService service) {
		
		this.service = service;
		
	}
	
	@GetMapping
	public Iterable<Articulo> list() {
		
		return service.list();
		
	}
	
	@GetMapping("/{cod}")
	public Articulo find(@PathVariable("cod") int cod) {
		
		return service.find(cod);
		
	}
	
	@PostMapping
	public Articulo create(@RequestBody Articulo articulo) {
		
		return service.save(articulo);
		
	}
	
	@PutMapping("/{cod}")
	public Articulo update(@PathVariable("cod") int cod, @RequestBody Articulo articulo) {
		
		return service.update(cod, articulo);
		
	}
	
	@DeleteMapping("/{cod}")
	public boolean delete(@PathVariable("cod") int cod) {
		
		return service.delete(cod);
		
	}
	
}
