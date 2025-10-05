package main.java.br.com.avaliacao.questao2.pagamentos.factories;

import main.java.br.com.avaliacao.questao2.pagamentos.processors.PaymentProcessor;
import main.java.br.com.avaliacao.questao2.pagamentos.receipts.PaymentReceipt;
import main.java.br.com.avaliacao.questao2.pagamentos.validators.PaymentValidator;

public interface PaymentAbstractFactory {
    PaymentProcessor createProcessor();
    PaymentValidator createValidator();
    PaymentReceipt createReceipt();
}