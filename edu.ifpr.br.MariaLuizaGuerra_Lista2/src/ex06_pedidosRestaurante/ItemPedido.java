package ex06_pedidosRestaurante;

public class ItemPedido {

	private String nomePrato;
	double preco;
	
	public ItemPedido(String nomePrato, double preco){
		this.nomePrato = nomePrato;
		this.preco = preco;
		
	}

	public static Object get(int i) {
		return null;
	}

	public String getNomePrato() {
		return nomePrato;
	}

}
