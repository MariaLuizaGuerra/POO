package ex03_logistica;

import java.time.LocalDate;
import java.time.LocalTime;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		GPS gps = new GPS( 12354, 14335, LocalDate.parse("2026-05-15"), LocalTime.of(14, 30));
		Caminhao caminhao = new Caminhao("AVX-21C8", gps);
		
		caminhao.LocalizacaoFormatada();
	}
}
