package edu.ifpr.MariaLuiza.DesafioLista3;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private String nome;
	private Curso curso;
	private List<Justificativa> justificativa;

	public Aluno(String nome, Curso curso, Justificativa justificativa) {
		this.nome = nome;
		this.curso = curso;
		this.justificativa = new ArrayList<Justificativa>();
	}

	public void totalJustificativas() {
		System.out.println("RELATÓRIO DE FALTAS:");
		System.out.println("Aluno: " + nome);
		System.out.println("Curso: " + curso.getNome());

		// isEmpty() = metodo para ver ser uma lista esta vazia
		if (justificativa.isEmpty()) {
			System.out.println("Nenhuma justificativa de falta registrada.");
		} else {
			System.out.println("Justificativas Registradas:" + justificativa.size());
			System.out.println();
		}
	}

	public int getTotalDiasJustificados() {
		int total = 0;
		for (int i = 0; i < justificativa.size(); i++) {
			total += justificativa.get(i).getPeriodoDias();
		}
		return total;
	}

	public void adicionarJustificativa(Justificativa justificativa) {
		this.justificativa.add(justificativa); // use "this.justificativas"
	}

	public String getNome() {
		return nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public List<Justificativa> getJustificativas() {
		return justificativa;
	}
}
