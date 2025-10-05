package main.java.br.com.avaliacao.questao1.transporte;

/**
 * Classe abstrata que representa um transporte genérico.
 * Cada tipo de transporte implementa sua própria regra de cálculo.
 */
public abstract class Transporte {

    protected String nome;

    public String getNome() {
        return nome;
    }

    public abstract double calcularTarifa(double distanciaKm, double pesoKg);
}