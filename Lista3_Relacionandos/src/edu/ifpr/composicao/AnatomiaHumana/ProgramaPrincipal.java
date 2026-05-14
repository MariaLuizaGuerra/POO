package edu.ifpr.composicao.AnatomiaHumana;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Humano humano = new Humano("Maria Luiza");

		System.out.println("Sinais vitais iniciais -----");
		System.out.println(humano.getNome() + ": " + humano.verificarSinaisVitais());

		System.out.println(" ");
		System.out.println("Iniciando exercício ----- ");
		humano.iniciarAtividadeFisica();
		System.out.println(humano.getNome() + ": " + humano.verificarSinaisVitais());

		System.out.println(" ");
		System.out.println("Parando exercício ----- ");
		humano.pararAtividadeFisica();
		System.out.println(humano.getNome() + ": " + humano.verificarSinaisVitais());
	}

}
