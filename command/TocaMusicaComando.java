package command;

public class TocaMusicaComando implements Comando {
        private Player player;
        private String nome_musica;

        public TocaMusicaComando ( Player player , String nome_musica ) {
                this.player = player;
                this.nome_musica = nome_musica;
        }

        @Override 
        public void executa() throws InterruptedException {
            this.player.play(this.nome_musica);
        }
}
