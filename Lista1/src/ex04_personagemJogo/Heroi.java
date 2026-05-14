package ex04_personagemJogo;

public class Heroi {

	private String nome;
	private int nivel;
	private int forca;

	public Heroi(String nome, int nivel, int forca) {
		this.nome = nome;
		this.nivel = nivel;
		this.forca = forca;
	}

	public void atacar() {
        int dano = forca * nivel;
        System.out.println(nome + " atacou e causou " + dano + " de dano!");
    }

}
