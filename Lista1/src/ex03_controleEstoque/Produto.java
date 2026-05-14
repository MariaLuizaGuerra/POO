package ex03_controleEstoque;

public class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void adicionarEstoque(int qtde) {
        quantidade += qtde;
    }

    public void retirarEstoque(int qtde) {
        if (qtde < quantidade) {
        	 quantidade -= qtde;
           
        } else {
        	 System.err.println("Erro: estoque insuficiente para retirar " + qtde + " unidades.");
        	 System.err.println("Estoque disponivel: " + quantidade);
        }
    }

    public void aplicarDesconto(double porcentagem) {
        preco = preco - ((preco * porcentagem) / 100);
    }

    public void exibirInformacoes() {
        System.out.println("-----------INFORMACOES------------");
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preco unitario: " + preco);
        System.out.println("Valor total em estoque: " + (quantidade * preco));
    }

}
