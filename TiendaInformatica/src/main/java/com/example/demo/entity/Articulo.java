package com.example.demo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Articulo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod;
	private String name;
	private int price;
	
	@ManyToOne
	@JoinColumn(name="fabricante_cod")
	private Fabricante fabricante_cod;

	
	public Articulo() {}

	public Articulo(int cod, String name, int price) { //Fabricante fabricante
		this.cod = cod;
		this.name = name;
		this.price = price;
		//this.fabricante_cod = fabricante;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public Fabricante getFabricante() {
		
		return fabricante_cod;
		
	}
	
	public void setFabricante(Fabricante fabricante) {
		
		this.fabricante_cod = fabricante;
		
	}
	
}
