package logistica;

import java.time.LocalDate;
import java.time.LocalTime;

public class GPS {

	private int longitude;
	private int Latitude;
	private LocalDate ultimaSincronizacao;
	private LocalTime ultimaSincronizacaoHora;
	
	public GPS(int latitude, int longitude, LocalDate ultimaSincronizacao, LocalTime ultimaSincronizacaoHora) {
		this.Latitude = latitude;
		this.longitude = longitude;
		this.ultimaSincronizacao = ultimaSincronizacao;
		this.ultimaSincronizacaoHora = ultimaSincronizacaoHora;
	}

	public int getLongitude() {
		return longitude;
	}
	
	public int getLatitude() {
		return Latitude;
	}

	public LocalDate getAtualizacao() {
		return ultimaSincronizacao;
	}

	public LocalTime getAtualizacaoHora() {
		return ultimaSincronizacaoHora;
	}
	
	
}
