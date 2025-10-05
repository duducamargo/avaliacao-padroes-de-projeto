package main.java.br.com.avaliacao.questao1.servico;

import main.java.br.com.avaliacao.questao1.transporte.Transporte;

/**
 * Classe Singleton responsável por centralizar o cálculo das tarifas.
 */
public class CalculadoraTarifas {

    private static CalculadoraTarifas instancia;

    private CalculadoraTarifas() {
    }

    public static CalculadoraTarifas getInstance() {
        if (instancia == null) {
            instancia = new CalculadoraTarifas();
        }
        return instancia;
    }

    public double calcular(Transporte transporte, double distanciaKm, double pesoKg) {
        System.out.println("Calculando tarifa para: " + transporte.getNome());
        return transporte.calcularTarifa(distanciaKm, pesoKg);
    }
}