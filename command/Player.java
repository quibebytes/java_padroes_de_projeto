package command;

public class Player {

    public void play ( String nome_musica ) throws InterruptedException {
        System.out.println("Iniciando a reprodução da música: " +nome_musica);
        int duracao_seg = 10;
        System.out.println("Duração da música em segundos: "+duracao_seg);
        Thread.sleep(duracao_seg *1000);
        System.out.println("Fim da reproducao da música: "+nome_musica);
    }
    public void increaseVolume (int levels ) {
        System.out.println("Aumentando o volume em: " +levels+ ".");
    }

    public void decreaseVolume (int levels ) {
         System.out.println("Diminuindo o volume em: " +levels+ ".");
    }
}