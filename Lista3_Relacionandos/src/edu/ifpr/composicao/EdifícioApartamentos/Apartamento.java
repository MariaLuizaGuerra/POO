package edu.ifpr.composicao.EdifícioApartamentos;

public class Apartamento {
	
	private int numero;
	private double area;
	
	public Apartamento(int numero, double area) {
		this.numero = numero;
		this.area = area;
	}

	public double getArea() {
		return area;
	}


	public int getNumero() {
        return numero;
    }

	

}
