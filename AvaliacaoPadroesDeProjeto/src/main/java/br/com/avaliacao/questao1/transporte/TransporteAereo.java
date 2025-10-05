package main.java.br.com.avaliacao.questao1.transporte;

/**
 * Implementação concreta do transporte aéreo.
 * Regra: tarifa baseada principalmente no peso.
 */
public class TransporteAereo extends Transporte {

    public TransporteAereo() {
        this.nome = "Transporte Aéreo";
    }

    @Override
    public double calcularTarifa(double distanciaKm, double pesoKg) {
        double valorBase = pesoKg * 8.0;
        double adicionalDistancia = distanciaKm * 0.2;
        return valorBase + adicionalDistancia;
    }
}