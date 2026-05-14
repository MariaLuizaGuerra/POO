package ex07_contaBancaria;

public class Conta {
	private int numero;
	private double saldo;
	
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			System.out.println("Saque efetuado com sucesso");
			System.out.println("Saldo atual: R$" + saldo);
		}
		else {
			System.err.println("Saldo Insulficiente!!");
			System.out.println("Saldo em conta: R$" + saldo);
		}
	}
	
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Saldo atual: R$" + saldo);
	}
	
	public void extrato() {
		System.out.println("Numero da conta: " + numero);
		System.out.println("Saldo da conta R$" + saldo);
	}
}
