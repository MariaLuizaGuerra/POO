package edu.ifpr.MariaLuiza.DesafioLista3;

import java.time.LocalDate;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		// 1. Criar o curso "Java Avançado"
		Curso curso = new Curso("Java Avançado");

		// 2. Criar o aluno matriculado no curso
		Aluno aluno = new Aluno("Claude Sonnet", curso);

		// 3. Criar a secretaria responsável pelos registros
		Secretaria secretaria = new Secretaria("Maria Oliveira");

		// 4. Criar e registrar duas justificativas de faltas via Secretaria
		Justificativa justificativa1 = new Justificativa("Consulta médica e repouso por gripe",LocalDate.of(2026, 4, 7), 3);
		Justificativa justificativa2 = new Justificativa("Participação em congresso de tecnologia",LocalDate.of(2026, 5, 2), 2);

		secretaria.RegistrarJustificativa(aluno, justificativa1);
		secretaria.RegistrarJustificativa(aluno, justificativa2);

		// 5. Exibir o relatório de faltas do aluno
		aluno.MostrarFaltas();
	}

}

//- Aluno ──► Curso          : Associação (cada aluno tem um curso)
//- Aluno ──► Justificativas : Agregação  (lista de justificativas)
//- Secretaria ──► Aluno     : Dependência (opera sobre o aluno)