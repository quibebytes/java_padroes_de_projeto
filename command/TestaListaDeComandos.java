package command;

public class TestaListaDeComandos {
    public static void main(String[] args) throws InterruptedException {
        Player player = new Player();
        ListaDeComandos Playlist = new ListaDeComandos();

        Playlist.adiciona(new  TocaMusicaComando(player, "song_VitoriosoÉs.mp3"));
        Playlist.adiciona(new AumentaVolumeComando(player, 3));
        Playlist.adiciona(new DiminuiVolumeComando(player, 2));

        Playlist.executa();
    }
    
}
