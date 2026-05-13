package edu.ifpr.composicao.EdifícioApartamentos;

import java.util.ArrayList;
import java.util.List;

public class Edificio {

	private String nomeEdificio;
	private List<Apartamento> apartamentos;

	public Edificio(String nomeEdificio) {
		this.nomeEdificio = nomeEdificio;
		this.apartamentos = new ArrayList<Apartamento>();
	}

	public void adicionarApartamento(int numero, double area) {
		Apartamento apt = new Apartamento(numero, area);
		this.apartamentos.add(apt);
		System.out.println("Apartamento " + numero + " (" + area + "m²) adicionado ao " + nomeEdificio);
	}

	 public double calcularAreaTotal() {
	        double areaTotal = 0;
	        for (int i = 0; i < apartamentos.size(); i++) {
	            Apartamento apt = apartamentos.get(i);
	            areaTotal += apt.getArea();
	        }
	        return areaTotal;
	    }

	 public String getNomeEdificio() {
		return nomeEdificio;
	 }

}
