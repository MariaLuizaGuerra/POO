package edu.ifpr.MariaLuiza.DesafioLista3;

import java.time.LocalDate;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Curso curso = new Curso("Java");

		Aluno aluno = new Aluno("Maria luiza Guerra", curso, null);

		Secretaria secretaria = new Secretaria("Julia Fontana");

		Justificativa justificativa1 = new Justificativa("Consulta médica e repouso por gripe",LocalDate.of(2026, 4, 7), 3);
		Justificativa justificativa2 = new Justificativa("Participação em congresso de tecnologia",LocalDate.of(2026, 5, 2), 2);

		secretaria.RegistrarJustificativa(aluno, justificativa1);
		secretaria.RegistrarJustificativa(aluno, justificativa2);

		aluno.totalJustificativas();
	}

}

//- Aluno -> Curso -> Associação 
//- Aluno -> Justificativas -> Agregação  
//- Secretaria -> Aluno -> Dependência 