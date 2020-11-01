import java.math.BigDecimal;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Farmacia farmacia = new Farmacia();

        Fornecedor f1 = new Fornecedor("Floriano");
        Fornecedor f2 = new Fornecedor("Joaquina");

        Cosmetico c1 = new Cosmetico(new BigDecimal(20), "shampoo", new Date("10/12/2021"), f1, 1);
        Cosmetico c2 = new Cosmetico(new BigDecimal(15), "condicionador", new Date("10/12/2021"), f1, 20);
        Cosmetico c3 = new Cosmetico(new BigDecimal(10.50), "creme de cabelo", new Date("22/01/2023"), f1, 30);

        Medicamento m1 = new Medicamento(new BigDecimal(3.5), "tylenol", new Date("25/12/2022"), f2, 50);
        Medicamento m2 = new Medicamento(new BigDecimal(7.50), "paracetamol", new Date("25/12/2022"), f2, 47);
        Medicamento m3 = new Medicamento(new BigDecimal(12), "buscopam", new Date("25/12/2022"), f2, 30);

        farmacia.cadastrarProduto(c1);
        farmacia.cadastrarProduto(c2);
        farmacia.cadastrarProduto(c3);

        farmacia.cadastrarProduto(m1);
        farmacia.cadastrarProduto(m2);
        farmacia.cadastrarProduto(m3);

        farmacia.setDesconto(c1, 0.6);
        farmacia.setDesconto(c1,0.13);

        Cliente cl1 = new Cliente("12345678910");
        Cliente cl2 = new Cliente("00000000000");
        Cliente cl3 = new Cliente("11111111111");

        Venda v1 = new Venda(cl1);
        v1.adicionarProduto(c1);
        v1.adicionarProduto(m1);
        farmacia.vender(v1);

        Venda v2 = new Venda(cl3);
        v2.adicionarProduto(c1);
        v2.adicionarProduto(m2);
        farmacia.vender(v2);
    }
}
