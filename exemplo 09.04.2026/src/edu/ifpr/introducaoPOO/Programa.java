package edu.ifpr.introducaoPOO;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Maria Guerra", "12345678910", 10, 3);
		aluno1.imprimirCarterinha();
		aluno1.lancarNota(1, 9.3f );
		aluno1.lancarNota(2, 10 );
		aluno1.lancarNota(3, 7.5f );
		aluno1.emitirBoletin();
		
		Aluno aluno2 = new Aluno("ANA VITORIA", "121.314.151.67", 11, 5);
		aluno2.imprimirCarterinha();
		aluno2.lancarNota(1, 9 );
		aluno2.lancarNota(2, 9.5f );
		aluno2.lancarNota(3, 6.7f );
		aluno2.lancarNota(4, 5.5f );
		aluno2.lancarNota(5, 8 );
		aluno2.emitirBoletin();
		
;
	}

}
