package edu.ifpr.associacao.Biblioteca;

public class Usuario {

	private String nome;

	public Usuario(String nome) {
		this.nome = nome;
	}
	
	public void tomarEmprestado(Livro livro) {
		
        if (livro.isDisponivel()) {
            livro.emprestar();
            System.out.println(nome + " pegou emprestado: " + livro.getTitulo());
        } else {
            System.out.println(livro.getTitulo() + " não está disponível.");
        }
    }

    public void devolver(Livro livro) {
        livro.devolver();
        System.out.println(nome + " devolveu: " + livro.getTitulo());
    }
}
