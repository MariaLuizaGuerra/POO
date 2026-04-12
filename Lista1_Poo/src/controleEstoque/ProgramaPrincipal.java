package controleEstoque;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Notebook", 10, 5000);
		produto1.adicionarEstoque(10);
		produto1.aplicarDesconto(10);	
		produto1.exibirInformacoes();
		
		Produto produto2 = new Produto("PC DESKTOP", 3, 3200);
		produto2.adicionarEstoque(2);
		produto2.retirarEstoque(10);
		produto2.exibirInformacoes();
		
	}

}
