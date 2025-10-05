package main.java.br.com.avaliacao.questao2.pagamentos.receipts;

public class BoletoReceipt implements PaymentReceipt {
    @Override
    public void generateReceipt(double amount) {
        System.out.println("[Boleto] Receipt generated: Boleto payment of R$ " + amount);
    }
}