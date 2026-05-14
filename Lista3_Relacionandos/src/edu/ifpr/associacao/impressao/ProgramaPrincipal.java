package edu.ifpr.associacao.impressao;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Computador computador = new Computador("Acer");
		Impressora impressora = new Impressora("HP LaserJet", 1);

		computador.conectarImpressora(impressora);

		System.out.println("Iniciando impressões");

		// 20 para mostrar que vai dar erro
		for (int i = 1; i <= 20; i++) {
			System.out.println("Tentativa " + i + ":");
			computador.enviarDocumento("Relatório " + i);
			System.out.println();
		}

	}

}
