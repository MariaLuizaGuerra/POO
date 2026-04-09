package sistemaBibliote;

public class ProgramaPrincipal {
	public static void main(String[] args) {

		Livro livro1 = new Livro("Mil beijos de um garoto", "Tillie Cole", 416);
		livro1.exibirDetalhes();
		
		Livro livro2 = new Livro("Rainha vermelha", "Victoria Aveyard", 900);
		livro2.exibirDetalhes();
	}
}
