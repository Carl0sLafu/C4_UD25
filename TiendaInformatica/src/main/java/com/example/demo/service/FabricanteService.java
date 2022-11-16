package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Fabricante;

@Service
public class FabricanteService {

	private List<Fabricante> fabricantes;
	public FabricanteService() {
		
		fabricantes = new ArrayList<>();
		fabricantes.add(new Fabricante(1, "Carlos"));
		
	}
	
	public List<Fabricante> list() {
		
		return fabricantes;
		
	}
	
	public Fabricante find(int cod) {
		
		for (Fabricante fabricante : fabricantes) {
			
			if (fabricante.getCod() == cod) {
					
				return fabricante;
				
			}
			
		}
		return null;
		
	}
	
	public Fabricante save(Fabricante fabricante) {
		
		fabricantes.add(fabricante);
		return fabricante;
		
	}
	
	public Fabricante update(int cod, Fabricante fab) {
		
		int index = 0;
		
		for (Fabricante fabricante : fabricantes) {
			
			if (fabricante.getCod() == cod) {
				
				fab.setCod(cod);
				fabricantes.set(index, fab);

				
			}
			
		}
		return fab;
		
	}
	
	public boolean delete(int cod) {
		
		for (Fabricante fabricante : fabricantes) {
			
			if (fabricante.getCod() == cod) {
				
				return fabricantes.remove(fabricante);
				
			}
			
		}
		
		return false;
		
	}
	
}
