package command;
import java . util . ArrayList ;
import java . util . List;


 public class ListaDeComandos {
    private List<Comando> lista_comandos;
 
   public ListaDeComandos () {
      this.lista_comandos = new ArrayList<>();
   }
   public void adiciona ( Comando comando ) {
      this.lista_comandos.add(comando);
   }

   public void executa() throws InterruptedException{
      System.out.println("-----INICIANDO EXECUÇÃO DE COMANDOS -----");
      for(Comando comando: this.lista_comandos){
         comando.executa();
      } System.out.println("---- FIM DOS COMANDOS ----");
   }
}