package main.java.br.com.avaliacao.questao1.transporte;


public abstract class Transporte {

    protected String nome;

    public String getNome() {
        return nome;
    }

    public abstract double calcularTarifa(double distanciaKm, double pesoKg);
}