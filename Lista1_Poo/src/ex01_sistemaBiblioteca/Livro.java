package ex01_sistemaBiblioteca;



public class Livro {

	private String titular;
	private String autor;
	private int numPaginas;
	
	public Livro(String titular, String autor, int numPaginas) {
		this.titular = titular;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}
	
	public void exibirDetalhes() {
		System.out.println("--------INFORMAÇÕES--------");
		System.out.println("Titular: " + titular);
		System.out.println("Autor: " + autor);
		System.out.println("Numero de paginas: " + numPaginas);
	}
	
	
	
}
