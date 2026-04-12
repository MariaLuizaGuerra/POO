package controleEstoque;

public class Produto {

	private String nome;
	private int quantidade;
	private double preco;

	public Produto(String nome, int quantidade, double string) {

		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = string;

	}

	public void adicionarEstoque(int qtd) {
		quantidade += qtd;
	}

	public void retirarEstoque(int qtde) {
	    if ((quantidade - qtde) < 0) {
	    	System.err.println("Erro: Quantidade insuficiente em estoque para retirar " + qtde + " unidades.");
	    } 
	    else {
	        quantidade -= qtde;
	    }
	}

	public void aplicarDesconto(double porcentagem) {
		preco = preco - ((preco * porcentagem) / 100);
	}

	public void exibirInformacoes() {
		System.out.println("-----------INFORMAÇÕES------------");
		System.out.println("Nome: " + nome);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Preco unitario: " + preco);
		System.out.println("Valor total em estoque: " + (quantidade * preco));
	}
}
