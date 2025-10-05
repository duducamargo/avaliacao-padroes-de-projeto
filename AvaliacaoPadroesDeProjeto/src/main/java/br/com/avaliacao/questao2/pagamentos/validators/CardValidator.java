package main.java.br.com.avaliacao.questao2.pagamentos.validators;

public class CardValidator implements PaymentValidator {
    @Override
    public boolean validate() {
        System.out.println("[Card] Validating card number and expiration date...");
        return true;
    }
}