package ex08_temperatura;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Termometro temperatura = new Termometro(25.0);
		temperatura.aumentarTemperatura(5);
        System.out.println("Em Fahrenheit: " + temperatura.exibirFahrenheit() + "°F");
    
	}

}
