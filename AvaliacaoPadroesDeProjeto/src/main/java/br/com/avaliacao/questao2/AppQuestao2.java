package main.java.br.com.avaliacao.questao2;

import main.java.br.com.avaliacao.questao2.gateway.PaymentGateway;
import main.java.br.com.avaliacao.questao2.pagamentos.factories.BoletoPaymentFactory;
import main.java.br.com.avaliacao.questao2.pagamentos.factories.CardPaymentFactory;
import main.java.br.com.avaliacao.questao2.pagamentos.factories.PaymentAbstractFactory;
import main.java.br.com.avaliacao.questao2.pagamentos.factories.PixPaymentFactory;

/**
 * Classe principal da Questão 2.
 * Demonstra o uso do padrão Abstract Factory + Singleton.
 */
public class AppQuestao2 {

    public static void main(String[] args) {

        PaymentGateway gateway = PaymentGateway.getInstance();

        PaymentAbstractFactory cardFactory = new CardPaymentFactory();
        PaymentAbstractFactory boletoFactory = new BoletoPaymentFactory();
        PaymentAbstractFactory pixFactory = new PixPaymentFactory();

        System.out.println("=== Processing Different Payment Methods ===\n");

        gateway.processPayment(cardFactory, 350.0);
        gateway.processPayment(boletoFactory, 500.0);
        gateway.processPayment(pixFactory, 125.5);
    }
}