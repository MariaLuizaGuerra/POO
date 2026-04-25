package ex04_gestaoEquipe;

public class Jogador {

	private String nome ;
	private String posicao; 
	private int numeroCamisa;
	
	public Jogador(String nome, String posicao, int numeroCamisa) {
		this.nome = nome;
		this.posicao = posicao;
		this.numeroCamisa = numeroCamisa;
	}

	public void mostrarEscalacao() {
		System.out.println("Nome: " + nome);
		System.out.println("Posicao: " + posicao);
		System.out.println("Número camisa: " + numeroCamisa);
		
	}
}
