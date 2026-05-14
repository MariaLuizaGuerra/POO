package edu.ifpr.MariaLuiza.DesafioLista3;

import java.time.LocalDate;

public class Justificativa {

	private String descricao;
	private LocalDate dataInicio;
	private int periodoDias;
	
	public Justificativa(String descricao, LocalDate dataInicio, int periodoDias) {
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.periodoDias = periodoDias;
	}
	
	public void mostrarJustificativa() {
		System.out.println("Motivo: " + descricao);
		System.out.println("Data: " + dataInicio);
		System.out.printf("Período: " + periodoDias);
	}

	public int getPeriodoDias() {
		return periodoDias;
	}

	public Object getDataInicio() {
		return dataInicio;
	}

	public String getDescricao() {
		return descricao;
	}


	
}
