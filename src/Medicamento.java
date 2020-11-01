import java.math.BigDecimal;
import java.util.Date;

public class Medicamento extends Produto{
    private static final double DESCONTO_MAXIMO = 0.1;

    public Medicamento(BigDecimal preco, String descricao, Date validade, Fornecedor fornecedor, int estoque){
        super(preco, descricao, validade, DESCONTO_MAXIMO, fornecedor, estoque);
    }

}
