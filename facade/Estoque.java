package facade;
import java.util.HashMap;
import java.time.LocalDate;

public class Estoque {
    // String = nome do produto + o endereco de entrega
    // Integer = quantidade de dias para a entrega
    private HashMap<String, LocalDate> datas_previstas_entregas;
    // <endereco de entrega, nome do cliente>
    private HashMap<String, String> enderecosDosClientes;
    PosVenda posVenda;

    public Estoque(PosVenda posVenda) {
        this.datas_previstas_entregas = new HashMap<String, LocalDate>();
        this.enderecosDosClientes = new HashMap<String, String>();
        this.posVenda = posVenda;
    }
    
    public void enviaProduto(String produto, String enderecoDeEntrega) {
        LocalDate data_prevista = datas_previstas_entregas.get(produto + enderecoDeEntrega);

        if (LocalDate.now().isAfter(data_prevista)) {
            System.out.println(
                "Depois de " + data_prevista +
                " dias, o produto \""+ produto +
                "\" foi entregue no endereco " + enderecoDeEntrega
           );
           datas_previstas_entregas.remove(produto + enderecoDeEntrega);
           posVenda.agendaContato(this.enderecosDosClientes.get(enderecoDeEntrega), produto);
        } else {
            System.out.println("Produto a caminho, previsao de entrega:");
            System.out.println("" + data_prevista);
        }
    }

    public void cadastrarEndereco(String cliente, String endereco) {
        this.enderecosDosClientes.put(endereco, cliente);
    }

    public LocalDate dataDeEntrega(String produto, String enderecoDeEntrega) {
        return datas_previstas_entregas.get(produto + enderecoDeEntrega);
    }

    public void cadastrarProduto(String produto, String enderecoDeEntrega, LocalDate data) {
        datas_previstas_entregas.put(produto + enderecoDeEntrega, data);
    }
	
	
}
