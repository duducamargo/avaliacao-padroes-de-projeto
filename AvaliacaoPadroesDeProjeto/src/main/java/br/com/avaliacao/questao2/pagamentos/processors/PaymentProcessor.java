package main.java.br.com.avaliacao.questao2.pagamentos.processors;

public interface PaymentProcessor {
    void process(double amount);
}