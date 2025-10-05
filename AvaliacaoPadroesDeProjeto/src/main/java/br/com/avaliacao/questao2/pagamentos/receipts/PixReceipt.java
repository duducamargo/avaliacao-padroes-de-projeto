package main.java.br.com.avaliacao.questao2.pagamentos.receipts;

public class PixReceipt implements PaymentReceipt {
    @Override
    public void generateReceipt(double amount) {
        System.out.println("[PIX] Receipt generated: PIX transfer of R$ " + amount);
    }
}