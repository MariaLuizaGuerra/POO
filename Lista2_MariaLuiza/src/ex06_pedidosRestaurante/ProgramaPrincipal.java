package ex06_pedidosRestaurante;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		ItemPedido item1 = new ItemPedido("Hamburguer",   25.00);
        ItemPedido item2 = new ItemPedido("Refrigerante",  8.00);
        ItemPedido item3 = new ItemPedido("Batata Frita",  10.00);

        Pedido pedido = new Pedido(5, null);

        pedido.adicionarItens(item1);
        pedido.adicionarItens(item2);
        pedido.adicionarItens(item3);

        pedido.listarItens();
        pedido.fecharConta();
	}

}
