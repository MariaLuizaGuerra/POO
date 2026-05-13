package edu.ifpr.MariaLuiza.DesafioLista3;

public class Secretaria {

	private String nomeResponsavel;

	public Secretaria(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public void RegistrarJustificativa(Aluno aluno, Justificativa justificativa) {
		aluno.adicionarJustificativa(justificativa);
		System.out.println("Justificativa registrada com sucesso!");
		System.out.println("Responsável: " + nomeResponsavel);
		System.out.println("Aluno: " + aluno.getNome());
		System.out.println("Motivo: " + justificativa.getDescricao());
		System.out.printf("Período: " + justificativa.getPeriodoDias() + justificativa.getDataInicio());
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}
}
