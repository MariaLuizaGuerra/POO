package monitoramento;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Processador processador = new Processador("Core i7", 75);
		Computador computador = new Computador("Dell", processador);
		
		computador.verficarStatus();
	}
	
}
