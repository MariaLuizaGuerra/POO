package ex06_pedidosRestaurante;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private int numeroMesa;
	private List<ItemPedido> itens;
	
	public Pedido(int numeroMesa, List<ItemPedido> itensPedido) {
		this.numeroMesa = numeroMesa;
		this.itens = new ArrayList<ItemPedido>();
	}
	
	public void fecharConta() {
		double totalItens = 0;
		for(int i = 0; i < itens.size(); i++) {
			totalItens = totalItens + itens.get(i).preco;
		}
		double taxa = totalItens * 0.10;
		double totalConta = totalItens + taxa ;
		
		System.out.println("----- Fechamento Mesa: " + numeroMesa + " ----- ");
		System.out.println("Subtotal: " + totalItens);
		System.out.println("Taxa: " + taxa);
		System.out.println("Valor final: " + totalConta);
	}
	
	public void listarItens() {
		System.out.println("");
		for(int i = 0; i < itens.size(); i++) {
			System.out.println(itens.get(i).getNomePrato() + " ---> " + itens.get(i).preco);
		}
	}
	
	public void adicionarItens(ItemPedido item) {
		itens.add(item);
	}
}
