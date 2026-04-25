package ex06_simuladorContaEnergia;

public class Fatura {

	private double leituraAnterior;
	private double leituraAtual;
	private double valor;

	public Fatura(double leituraAnterior, double leituraAtual, double valor) {
		this.leituraAnterior = leituraAnterior;
		this.leituraAtual = leituraAtual;
		this.valor = valor;
	}

	public double calcularConsumo() {
		return leituraAtual - leituraAnterior;
	}

	public double calcularValorTotal() {
		return calcularConsumo() * valor;
	}

	public void imprimirFatura() {
		System.out.println("-----Fatura Energia Resumida----");
		System.out.println("Consumo: " + calcularConsumo());
		System.out.println("Valor Final: " + calcularValorTotal());
	}

	/*
	 * public void imprimirFatura() {
	 * System.out.println("-----Fatura Energia-----");
	 * System.out.println("Leitura anterior: " + leituraAnterior + " kWh");
	 * System.out.println("Leitura atual:  " + leituraAtual + " kWh");
	 * System.out.println("Consumo: " + calcularConsumo() + " kWh");
	 * System.out.printf("Valor do kWh: R$" + valor);
	 * System.out.printf("Valor Final: R$ " + calcularValorTotal());
	 * 
	 * }
	 */

}
