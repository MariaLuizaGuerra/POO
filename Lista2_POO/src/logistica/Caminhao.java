package logistica;

public class Caminhao {

	private String placa;
	private GPS gps;
	
	public Caminhao(String placa, GPS gps) {
	
		this.placa = placa;
		this.gps = gps;
	}
	
	public void LocalizacaoFormatada() {
		System.out.println("Localização: ( " + gps.getLatitude() + "," + gps.getLongitude() + " )");
		System.out.println("Ultima atualização: ");
		System.out.println("dia: " + gps.getAtualizacao()); 
		System.out.println("Horario: " + gps.getAtualizacaoHora());
	}
}
