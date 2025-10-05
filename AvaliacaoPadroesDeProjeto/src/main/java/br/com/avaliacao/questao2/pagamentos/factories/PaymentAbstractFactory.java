package main.java.br.com.avaliacao.questao2.pagamentos.factories;

import main.java.br.com.avaliacao.questao2.pagamentos.processors.PaymentProcessor;
import main.java.br.com.avaliacao.questao2.pagamentos.receipts.PaymentReceipt;
import main.java.br.com.avaliacao.questao2.pagamentos.validators.PaymentValidator;

/**
 * Abstract Factory responsável por criar famílias de objetos relacionados ao
 * meio de pagamento.
 */
public interface PaymentAbstractFactory {
    PaymentProcessor createProcessor();

    PaymentValidator createValidator();

    PaymentReceipt createReceipt();
}