package ex02_colaborador;


public class Colaborador {

	private String nome;
	private Contrato contrato;
	
	public Colaborador(String nome, Contrato contrato) {
		this.nome = nome;
		this.contrato = contrato;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void getCustoTotal() {
		System.out.println("O custo mensal da colaboradora " + nome + " é de R$" + contrato.CustoTotal());
	}
	
	
}
