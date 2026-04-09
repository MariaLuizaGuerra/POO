package petShop;

public class Cachorro {

	private String nome;
	private String raca;
	private int idade;
	
	public Cachorro (String nome, String raca, int idade) {
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		
	}
	
	public void cartetinha() {
		System.out.println("----------Carterinha----------");
		System.out.println("Nome: " + nome);
		System.out.println("Raçã: " + raca);
		System.out.println("Idade: " + idade);
	}
	
	public void latir() {
		System.out.println(nome + " está latindo : AU AU AU");
	}
	
	
}
