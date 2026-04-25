package ex05_personagemJogoAvancado;

public class Heroi {

	private String nome;
	private int nivel;
	private int pontosVida;
	private int maxVida;

	public Heroi(String nome, int nivel, int pontosVida, int maxVida) {
		this.nome = nome;
		this.nivel = nivel;
		this.pontosVida = pontosVida;
		this.maxVida = maxVida;
	}

	public void receberDano(int dano) {

		if (pontosVida - dano < 0) {
			System.err.println("Não pode ficar abaixo de 0");
			pontosVida = 0;
		} else {
			pontosVida -= dano;
		}

	}

	public void curar(int pontos) {

		if (pontosVida + pontos > 100) {
			System.err.println("limite máximo de 100");
			pontosVida = maxVida;
		} else {
			pontosVida += pontos;
		}
	}

	public void subirNivel() {
		nivel++;
        pontosVida = maxVida;
	}

	public void exibirinformacoes() {
		System.out.println("Nome:" + nome);
		System.out.println("Nivel: " + nivel);
		System.out.println("Vida: " + pontosVida + " de " + maxVida);
	}

}
