package main.java.br.com.avaliacao.questao2.pagamentos.factories;

import main.java.br.com.avaliacao.questao2.pagamentos.processors.*;
import main.java.br.com.avaliacao.questao2.pagamentos.validators.*;
import main.java.br.com.avaliacao.questao2.pagamentos.receipts.*;

/**
 * Fábrica concreta para pagamentos via PIX.
 */
public class PixPaymentFactory implements PaymentAbstractFactory {
    @Override
    public PaymentProcessor createProcessor() {
        return new PixProcessor();
    }

    @Override
    public PaymentValidator createValidator() {
        return new PixValidator();
    }

    @Override
    public PaymentReceipt createReceipt() {
        return new PixReceipt();
    }
}