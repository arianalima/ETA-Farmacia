import java.util.Date;

public class Cosmetico extends Produto{
    private static final double DESCONTO_MAXIMO = 0.2;

    public Cosmetico(double preco, String descricao, Date validade, Fornecedor fornecedor, int estoque) {
        super(preco, descricao, validade, DESCONTO_MAXIMO, fornecedor, estoque);
    }
}
