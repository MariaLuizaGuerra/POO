package ex07_contaBancaria;

public class ProgramaPrinciapl {

	public static void main(String[] args) {
		Conta conta = new Conta(1, 560);
		System.out.println("----- Saque -----");
		conta.sacar(200);
		System.out.println("----- Deposito -----");
		conta.depositar(450.50);
		System.out.println("----- Extrato -----");
		conta.extrato();

	}

}
