package main.java.br.com.avaliacao.questao2.pagamentos.processors;

public class PixProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("[PIX] Sending PIX request for R$ " + amount);
    }
}