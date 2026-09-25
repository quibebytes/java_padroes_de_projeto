package facade;
import java.util.HashMap;
import java.time.LocalDate;

public class PosVenda {
    // <cliente + nome do produto, data de compra>
    private HashMap<String, LocalDate> datasDeEntrega;

    public PosVenda() {
        this.datasDeEntrega = new HashMap<String, LocalDate>();
    }

    public void agendaContato(String cliente, String produto) {
        this.datasDeEntrega.put(cliente + produto, LocalDate.now());
    }

    public void exibirPrazoAgendamento(String cliente, String produto) {
        LocalDate dataDeEntrega = datasDeEntrega.get(cliente + produto);
        if (LocalDate.now().isAfter(dataDeEntrega.plusDays(30))) {
            System.out.println("Passou do prazo agendado, realizar pos-venda.");
        } else {
            System.out.println("Dentro do prazo de pos-venda");
        }
    }

}
