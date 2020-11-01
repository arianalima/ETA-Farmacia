import java.math.BigDecimal;
import java.util.ArrayList;

public class Farmacia {
    private ArrayList<Venda> vendas = new ArrayList<>();

    private ArrayList<Produto> produtos = new ArrayList<>();

    private ArrayList<Venda> getVendas(){
        return this.vendas;
    }

    public void vender(Venda venda){
        vendas.add(venda);
        System.out.println("--------------------------");
        System.out.println("Cliente: " + venda.getCliente().getCPF());
        System.out.println("Produtos: ");
        ArrayList<Produto> carrinho = venda.getProdutos();
        for (int i = 0; i < carrinho.size(); i++){
            Produto produto = carrinho.get(i);
            String descricao = produto.getDescricao();
            BigDecimal valorUnitario = produto.getPreco();
            if (validarEstoque(produto)) {
                atualizarEstoque(produto);
                System.out.println("\t" + (i + 1) + " - " + descricao + "\tR$ " + valorUnitario);
            }else {
                System.out.println("\t" + (i + 1) + " - " + descricao + "\tR$ " + valorUnitario + " !! Item sem estoque !!");
                BigDecimal valorTotal = venda.getValorTotal();
                venda.setValorTotal(valorTotal.subtract(produto.getPreco()));
            }
        }
        System.out.println("Valor total: R$ " + venda.getValorTotal());
        System.out.println("Venda realizada com sucesso!");
    }

    public void atualizarEstoque(Produto produto){
        int estoque = produto.getEstoque();
        produto.setEstoque(estoque-1);
    }

    public boolean validarEstoque(Produto produto){
        return  produto.getEstoque() >= 1;
    }

    public void cadastrarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public void setDesconto(Produto produto, double novoDesconto){
        String descricao = produto.getDescricao();
        System.out.println("Valor do produto " + descricao + " - R$ " + produto.getPreco());
        if (produto.setDesconto(novoDesconto)){
            System.out.println("Desconto de " + novoDesconto*100 + "% aplicado ao produto. Novo valor do produto " +
                    descricao + " - R$ " + produto.getPreco());
        }else {
            System.out.println("Desconto de " + novoDesconto*100 + "% inválido. O desconto máximo é de " + produto.getDescontoMaximo()*100 + "%");
        }
        produto.setDesconto(novoDesconto);
    }
}
