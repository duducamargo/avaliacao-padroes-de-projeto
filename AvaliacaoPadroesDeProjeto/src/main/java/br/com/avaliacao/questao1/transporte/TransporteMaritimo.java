package main.java.br.com.avaliacao.questao1.transporte;

/**
 * Implementação concreta do transporte marítimo.
 * Regra: considera taxa portuária, distância e peso.
 */
public class TransporteMaritimo extends Transporte {

    public TransporteMaritimo() {
        this.nome = "Transporte Marítimo";
    }

    @Override
    public double calcularTarifa(double distanciaKm, double pesoKg) {
        double taxaPortuaria = 150.0;
        double valorDistancia = distanciaKm * 1.5;
        double adicionalPeso = pesoKg * 0.05;
        return taxaPortuaria + valorDistancia + adicionalPeso;
    }
}