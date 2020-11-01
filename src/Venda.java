import java.math.BigDecimal;
import java.util.ArrayList;

public class Venda {
    private ArrayList<Produto> produtos = new ArrayList<>();
    private Cliente cliente;
    private BigDecimal valorTotal = new BigDecimal(0);

    public Venda(Cliente cliente){
        this.cliente = cliente;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
        this.valorTotal = this.valorTotal.add(produto.getPreco());
    }
}
