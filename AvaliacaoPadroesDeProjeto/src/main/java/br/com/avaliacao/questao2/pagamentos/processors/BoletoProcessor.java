package main.java.br.com.avaliacao.questao2.pagamentos.processors;

public class BoletoProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("[Boleto] Generating barcode for payment of R$ " + amount);
    }
}