package main.java.br.com.avaliacao.questao2.pagamentos.receipts;

public class CardReceipt implements PaymentReceipt {
    @Override
    public void generateReceipt(double amount) {
        System.out.println("[Card] Receipt generated: Credit card payment of R$ " + amount);
    }
}