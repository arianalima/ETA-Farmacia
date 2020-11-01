import java.math.BigDecimal;
import java.util.Date;

public abstract class Produto {
    private BigDecimal preco;
    private String descricao;
    private Date validade;
    private double descontoMaximo;
    private double desconto;
    private Fornecedor fornecedor;
    private int estoque;

    public Produto(BigDecimal preco, String descricao, Date validade, double descontoMaximo, Fornecedor fornecedor, int estoque){
        this.preco = preco.setScale(2, BigDecimal.ROUND_UP);
        this.descricao = descricao;
        this.validade = validade;
        this.descontoMaximo = descontoMaximo;
        this.fornecedor = fornecedor;
        this.desconto = 0;
        this.estoque = estoque;
    }

    public BigDecimal getPreco() {
        if (this.desconto > 0){
            return preco.subtract(this.preco.multiply(new BigDecimal(this.desconto))).setScale(2, BigDecimal.ROUND_UP);
        }
        return preco;
    }

    public void setPreco(BigDecimal preco) {
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

    public boolean setDesconto(double desconto) {
        if (desconto <= this.descontoMaximo){
            this.desconto = desconto;
            return true;
        }
        return false;
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
