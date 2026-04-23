package monitoramento;

public class Computador {

	private String marca;
	private Processador processador;
	
	public Computador(String marca, Processador processador) {
		this.marca = marca;
		this.processador = processador;
	}
	
	public void verficarStatus() {
		
		if(processador.getTemperatura() < 80) {
			System.out.println("Alerta de Risco"); 
		}
		else {
			System.out.println("Operação Normal");
		}
		
	}
}
