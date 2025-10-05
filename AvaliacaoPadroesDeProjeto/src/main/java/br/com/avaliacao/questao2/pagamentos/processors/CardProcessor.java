package main.java.br.com.avaliacao.questao2.pagamentos.processors;

public class CardProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("[Card] Processing credit card payment of R$ " + amount);
    }
}