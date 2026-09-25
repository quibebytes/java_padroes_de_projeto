package command;

public class AumentaVolumeComando implements Comando {
        private Player aumento;
        private int levels;

    public AumentaVolumeComando ( Player player , int levels ) {
                this.aumento = player;
                this.levels = levels;
    }
    public void executa () {
        this.aumento.increaseVolume(this.levels);
        }
    }