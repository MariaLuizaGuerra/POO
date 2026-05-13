package edu.ifpr.associacao.impressao;

public class Impressora {

	private String modelo;
	private double tonerDisponivel;

	public Impressora(String modelo, double tonerDisponivel) {
		this.modelo = modelo;
		this.tonerDisponivel = tonerDisponivel;
	}

	public void imprimir(String documento) {
		if (tonerDisponivel > 0.10) {
			System.out.println(documento);
			tonerDisponivel -= 0.05;
			System.out.printf("Toner restante: " +  Math.round(( tonerDisponivel * 100 ) * 100.0) / 100.0);
        } else {
            System.err.println("[" + modelo + "] Impressão cancelada — toner insuficiente (menos de " + Math.round(( tonerDisponivel * 100 ) * 100.0) / 100.0+ "% restante).");
        }
	}

	public String getModelo() {
		return modelo;
	}

}
