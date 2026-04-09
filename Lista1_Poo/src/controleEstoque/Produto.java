package controleEstoque;

public class Produto {

	private String nome;
	private int quantidade;
	private double preco;
	
	public Produto(String nome, int quantidade, float preco) {
		
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		
	}
	
	public void adicionarEstoque(int qtd) {
		quantidade += qtd;
	}
	
	public void retirarEstoque(int qtd) {
		quantidade -= qtd;
	}
	
	public void aplicarDesconto(double porcentagem) {
		preco = preco - ((preco * porcentagem) / 100);
	}
}
