package edu.ifpr.associacao.Biblioteca;

public class ProgramaPrincipal {

	public static void main(String[] args) {

        Livro livro1 = new Livro("Rainha vermelha");
        Livro livro2 = new Livro("A seleção");

        Usuario usuario = new Usuario("Maria");

      
        System.out.println("Status inicial" +  "-----");
        System.out.println(livro1.getTitulo());
        System.out.println("Disponível: " + livro1.isDisponivel());
        System.out.println(livro2.getTitulo());
        System.out.println("Disponível: " + livro2.isDisponivel());

        System.out.println(" ");
        System.out.println("Empréstimos" + "-----");
        usuario.tomarEmprestado(livro1);
        usuario.tomarEmprestado(livro2);

        System.out.println(" ");
        System.out.println("Tentando pegar livro já emprestado" + "-----");
        usuario.tomarEmprestado(livro1);

        System.out.println(" ");
        System.out.println("Devolvendo" + "-----");
        usuario.devolver(livro1);
        
        System.out.println(" ");
        System.out.println("Status final-------");
        System.out.println(livro1.getTitulo());
        System.out.println("Disponível: " + livro1.isDisponivel());
        System.out.println(livro2.getTitulo());
        System.out.println("Disponível: " + livro2.isDisponivel());
    }
}
