import java.util.Date;

public abstract class Produto {
    private double preco;
    private String descricao;
    private Date validade;
    private double descontoMaximo;
    private double desconto;
    private Fornecedor fornecedor;
    private int estoque;

    public Produto(double preco, String descricao, Date validade, double descontoMaximo, Fornecedor fornecedor, int estoque){
        this.preco = preco;
        this.descricao = descricao;
        this.validade = validade;
        this.descontoMaximo = descontoMaximo;
        this.fornecedor = fornecedor;
        this.desconto = 0;
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        if (desconto <= this.descontoMaximo){
            this.desconto = desconto;
            System.out.println("Desconto de " + desconto*100 + "% aplicado.");
        }else {
            System.out.println("Desconto inválido");
        }
    }

    public double getDescontoMaximo() {
        return descontoMaximo;
    }

    public void setDescontoMaximo(double descontoMaximo) {
        this.descontoMaximo = descontoMaximo;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
