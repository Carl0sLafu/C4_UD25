package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Articulo;

@Service
public class ArticulosService {
	
	private List<Articulo> articulos;
	
	public ArticulosService() {
		
		articulos = new ArrayList<>();
		articulos.add(new Articulo(1, "Placa Base", 55));
		
	}
	
	public List<Articulo> list() {
		
		return articulos;
		
	}
	
	public Articulo find(int cod) {
		
		for (Articulo fabricante : articulos) {
			
			if (fabricante.getCod() == cod) {
					
				return fabricante;
				
			}
			
		}
		return null;
		
	}
	
	public Articulo save(Articulo articulo) {
		
		articulos.add(articulo);
		return articulo;
		
	}
	
	public Articulo update(int cod, Articulo art) {
		
		int index = 0;
		
		for (Articulo articulo : articulos) {
			
			if (articulo.getCod() == cod) {
				
				art.setCod(cod);
				articulos.set(index, art);

				
			}
			
		}
		
		return art;
		
	}
	
	public boolean delete(int cod) {
		
		for (Articulo articulo : articulos) {
			
			if (articulo.getCod() == cod) {
				
				return articulos.remove(articulo);
				
			}
			
		}
		
		return false;
		
	}
	
}
