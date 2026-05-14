package ex06_simuladorContaEnergia;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Fatura fatura = new Fatura(1050, 1200, 0.60);
		fatura.imprimirFatura();
	}

}
