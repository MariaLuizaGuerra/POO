package edu.ifpr.composicao.EdifícioApartamentos;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Edificio edificio = new Edificio("Aurora");

		edificio.adicionarApartamento(101, 65.0);
		edificio.adicionarApartamento(102, 80.5);
		edificio.adicionarApartamento(201, 65.0);
		edificio.adicionarApartamento(202, 95.0);

		System.out.println("Área total do edificio: " + edificio.getNomeEdificio());
		System.out.println(edificio.calcularAreaTotal());
	}

}
