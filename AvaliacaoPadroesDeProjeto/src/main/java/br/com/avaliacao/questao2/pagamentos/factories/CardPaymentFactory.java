package main.java.br.com.avaliacao.questao2.pagamentos.factories;

import main.java.br.com.avaliacao.questao2.pagamentos.processors.*;
import main.java.br.com.avaliacao.questao2.pagamentos.validators.*;
import main.java.br.com.avaliacao.questao2.pagamentos.receipts.*;

public class CardPaymentFactory implements PaymentAbstractFactory {
    @Override
    public PaymentProcessor createProcessor() {
        return new CardProcessor();
    }

    @Override
    public PaymentValidator createValidator() {
        return new CardValidator();
    }

    @Override
    public PaymentReceipt createReceipt() {
        return new CardReceipt();
    }
}