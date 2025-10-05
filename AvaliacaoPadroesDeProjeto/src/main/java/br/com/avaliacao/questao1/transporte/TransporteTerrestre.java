package main.java.br.com.avaliacao.questao1.transporte;

/**
 * Implementação concreta do transporte terrestre.
 * Regra: tarifa baseada principalmente na distância.
 */
public class TransporteTerrestre extends Transporte {

    public TransporteTerrestre() {
        this.nome = "Transporte Terrestre";
    }

    @Override
    public double calcularTarifa(double distanciaKm, double pesoKg) {
        double valorBase = distanciaKm * 2.5;
        double adicionalPeso = pesoKg * 0.1;
        return valorBase + adicionalPeso;
    }
}