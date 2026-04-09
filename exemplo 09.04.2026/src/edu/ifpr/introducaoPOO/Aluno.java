package edu.ifpr.introducaoPOO;

public class Aluno {

	private String nome;
	private String cpf;
	private int matricula;
	private float[] notas;
	
	public Aluno(String nome, String cpf, int matricula, int quantidadeEtapas) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.notas = new float[quantidadeEtapas];
		
	}
	
	public void imprimirCarterinha() {
		System.out.println("--------ALUNO-------------");
		System.out.println("Nome: " + nome.toUpperCase());
		System.out.println("Matricula: " + matricula);
		System.out.println("CPF: " + cpf);
	}
	
	public void lancarNota(int etapa, float nota) {
		if(etapa > 0 && etapa <= notas.length) {
			notas[etapa-1] = nota;
		}
		else {
			System.out.println("Você inseriu uma etapa invalida. O aluno possui apenas " + notas.length + "etapas");
		}
	}
	
	public void emitirBoletin() {
		System.out.println("----------BOLETIM-----------");
		System.out.println("Nome: " + nome.toUpperCase());
		System.out.println("Matricula: " + matricula);
		for(int  i = 0; i < notas.length; i++) {
			System.out.println("Etapa " + (i+1) + ": " + notas[i]);
		}
		System.out.println("-----------");
		System.out.println("Média final: " + calcularMedia());
		System.out.println("-----------------------------");
	}
	
	private float  calcularMedia() {
		float soma = 0;
		for(float n : notas) {
			soma += n;
		}
		float media = soma / notas.length;
		return Math.round((media * 100.0f) / 100.0f) ;
		
	}
}
