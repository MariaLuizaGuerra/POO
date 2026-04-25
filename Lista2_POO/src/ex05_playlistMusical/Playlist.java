package ex05_playlistMusical;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

	private String nomePlayList;
	private List<Musica> musicas;

	public Playlist(String nomePlayList) {
		this.nomePlayList = nomePlayList;
		this.musicas = new ArrayList<Musica>();
	}

	public String calcularTempoTotal() {
	    int totalSegundos = 0;
	    for (int i = 0; i < musicas.size(); i++) {
	        totalSegundos += musicas.get(i).duracaoSegundos;
	    }
	    
	    int min = totalSegundos / 60;
	    int seg = totalSegundos % 60;

		String segFormatado;
		if (seg < 10) {
			segFormatado = "0" + seg;
		} else {
			segFormatado = "" + seg;
		}
	    
	    return  min + ":" + segFormatado;
	}

	public void removerMusica(String titulo) {

		System.out.println("----- Removendo -----");
		for (int i = 0; i < musicas.size(); i++) {
			if (musicas.get(i).getTitulo().equalsIgnoreCase(titulo)) {
				musicas.remove(i);
				System.out.println("Musica '" + titulo + "' removida com sucesso!");
				return;
			}
		}
	}

	public void adicionarMusica(Musica musica) {
		musicas.add(musica);
	}

	public void exibirPlaylist() {
		System.out.println("----- Playlist: " + nomePlayList + " -----");
		for (int i = 0; i < musicas.size(); i++) {
			int min = musicas.get(i).duracaoSegundos / 60;
			int seg = musicas.get(i).duracaoSegundos % 60;

			String segFormatado;
			if (seg < 10) {
				segFormatado = "0" + seg;
			} else {
				segFormatado = "" + seg;
			}

			System.out.println(musicas.get(i).getTitulo() + " - " + musicas.get(i).getArtista() + " - " + min + ":" + segFormatado);
		}
		System.out.println("Tempo total: " + calcularTempoTotal());
		System.out.println(" ");
	}
}
