package ex03_controleEstoque;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		Produto pc = new Produto("PC Desktop", 0, 2000.00);  
		pc.adicionarEstoque(2);
		pc.retirarEstoque(3); 
		pc.exibirInformacoes();

		Produto notebook = new Produto("Notebook", 0, 3000.00);
		notebook.adicionarEstoque(10);
		notebook.aplicarDesconto(10);
		notebook.exibirInformacoes();

	    
	}
}
