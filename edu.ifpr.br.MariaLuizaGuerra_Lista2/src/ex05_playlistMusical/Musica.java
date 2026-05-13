package ex05_playlistMusical;

public class Musica {

	private String titulo;
	private String artista;
	int duracaoSegundos;

	public Musica(String titulo, String artista, int duracaoSegundos) {
		this.titulo = titulo;
		this.artista = artista;
		this.duracaoSegundos = duracaoSegundos;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getArtista() {
		return artista;
	}

}
