package ex08_temperatura;

public class Termometro {

	private double temperaturaCelsius;
	
	public Termometro(double temperaturaCelsius) {
		this.temperaturaCelsius = temperaturaCelsius;
	}
	
	public void aumentarTemperatura(double valor) {
		temperaturaCelsius += valor;
	}
	public void diminuirTemperatura(double valor) {
		temperaturaCelsius -= valor;
	}
	public double exibirFahrenheit() {
		return (temperaturaCelsius * 1.8) + 32;
	}
}
