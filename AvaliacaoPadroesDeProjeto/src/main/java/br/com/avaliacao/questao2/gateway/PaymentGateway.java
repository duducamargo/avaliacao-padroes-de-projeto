package main.java.br.com.avaliacao.questao2.gateway;

import main.java.br.com.avaliacao.questao2.pagamentos.factories.PaymentAbstractFactory;
import main.java.br.com.avaliacao.questao2.pagamentos.processors.PaymentProcessor;
import main.java.br.com.avaliacao.questao2.pagamentos.receipts.PaymentReceipt;
import main.java.br.com.avaliacao.questao2.pagamentos.validators.PaymentValidator;

/**
 * Singleton que centraliza o fluxo de pagamento.
 * Usa a Abstract Factory para criar os objetos corretos dinamicamente.
 */
public class PaymentGateway {

    private static PaymentGateway instance;

    private PaymentGateway() {
    }

    public static PaymentGateway getInstance() {
        if (instance == null) {
            instance = new PaymentGateway();
        }
        return instance;
    }

    public void processPayment(PaymentAbstractFactory factory, double amount) {
        PaymentValidator validator = factory.createValidator();
        PaymentProcessor processor = factory.createProcessor();
        PaymentReceipt receipt = factory.createReceipt();

        if (validator.validate()) {
            processor.process(amount);
            receipt.generateReceipt(amount);
            System.out.println("Payment completed successfully.\n");
        } else {
            System.out.println("Payment validation failed.\n");
        }
    }
}