package com.example.demo.entity;

import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Fabricante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod;
	private String name;
	
	@OneToMany
	@JoinColumn(name="fabricante_cod")
	private List<Articulo> articulos;
	
	public Fabricante() {}

	public Fabricante(int cod, String name) {
		this.cod = cod;
		this.name = name;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fabricante_cod")
	public List<Articulo> getFabricante() {
		
		return articulos;
		
	}
	
	public void setFabricante(List<Articulo> articulo) {
		
		this.articulos = articulo;
		
	}
	
}
