package main.java.br.com.avaliacao.questao2.pagamentos.validators;

public class PixValidator implements PaymentValidator {
    @Override
    public boolean validate() {
        System.out.println("[PIX] Validating PIX key...");
        return true;
    }
}