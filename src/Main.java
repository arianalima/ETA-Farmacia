import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Fornecedor f1 = new Fornecedor("Floriano");
        Fornecedor f2 = new Fornecedor("Joaquina");

        Cosmetico c1 = new Cosmetico(20, "shampoo", new Date("10/12/2021"), f1, 15);
        Cosmetico c2 = new Cosmetico(15, "condicionador", new Date("10/12/2021"), f1, 20);
        Cosmetico c3 = new Cosmetico(10.50, "creme de cabelo", new Date("22/01/2023"), f1, 30);

        Medicamento m1 = new Medicamento(3.5, "tylenol", new Date("25/12/2022"), f2, 50);
        Medicamento m2 = new Medicamento(7.50, "paracetamol", new Date("25/12/2022"), f2, 47);
        Medicamento m3 = new Medicamento(12, "buscopam", new Date("25/12/2022"), f2, 30);


        c1.setDesconto(0.6);
        c1.setDesconto(0.13);
    }
}
