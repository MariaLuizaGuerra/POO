package ex05_playlistMusical;

public class ProgramaPrincipal {
	public static void main(String[] args) {
        Musica musica1 = new Musica("Canção Infantil", "Cesar Mc", 270);
        Musica musica2 = new Musica("Lanca Menina", "Luiza Sonza", 391);
        Musica musica3 = new Musica("Pai de Menina", "Zé neto & Cistiano", 482);
        Musica musica4 = new Musica("Meteoro da paixao", "Lauan Santana", 187);

        Playlist playlist = new Playlist("Favoritas");

        playlist.adicionarMusica(musica1);
        playlist.adicionarMusica(musica2);
        playlist.adicionarMusica(musica3);
        playlist.adicionarMusica(musica4);

        playlist.exibirPlaylist();

        playlist.removerMusica("Pai de Menina");
        playlist.removerMusica("Canção Infantil");

        System.out.println("");
        playlist.exibirPlaylist();
    }

}
