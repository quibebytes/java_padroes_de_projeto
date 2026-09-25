package command;

    public class DiminuiVolumeComando implements Comando {
        private Player diminuir;
        private int levels;

    public DiminuiVolumeComando ( Player diminuir , int levels ) {
            this.diminuir = diminuir;
            this.levels = levels;
    }
    public void executa ()throws InterruptedException  {
        this.diminuir.decreaseVolume(this.levels);
    }
}
