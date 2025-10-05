package main.java.br.com.avaliacao.questao2.pagamentos.validators;

public class BoletoValidator implements PaymentValidator {
    @Override
    public boolean validate() {
        System.out.println("[Boleto] Validating payer information...");
        return true;
    }
}