package edu.ifpr.MariaLuiza.DesafioLista3;

import java.util.List;

public class Aluno {

	private String nome;
	private Curso curso;
	private List<Justificativa> justificativas;

	public Aluno(String nome, Curso curso) {
		this.nome = nome;
		this.curso = curso;
	}

	public void MostrarFaltas() {
		System.out.println("RELATÓRIO DE FALTAS:");
		System.out.printf("Aluno: " + nome);
		System.out.printf("Curso: ", curso.getNome());

		// isEmpty() = metodo para ver ser uma lista esta vazia
		if (justificativas.isEmpty()) {
			System.out.println("Nenhuma justificativa de falta registrada.");
		} else {
			System.out.println("Justificativas Registradas (" + justificativas.size() + "):");
			System.out.println();
			for (int i = 0; i < justificativas.size(); i++) {
				System.out.println(i + 1);
				System.out.println(justificativas.get(i));
				System.out.println();
			}
			System.out.println(" ");
			System.out.printf("Total de dias justificados:", getTotalDiasJustificados());
		}
	}

	public void adicionarJustificativa(Justificativa justificativa) {
		this.justificativas.add(justificativa);
	}

	public int getTotalDiasJustificados() {
	    int total = 0;
	    for (int i = 0; i < justificativas.size(); i++) {
	        total += justificativas.get(i).getPeriodoDias();
	    }
	    return total;
	}

	public String getNome() {
		return nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public List<Justificativa> getJustificativas() {
		return justificativas;
	}
}
