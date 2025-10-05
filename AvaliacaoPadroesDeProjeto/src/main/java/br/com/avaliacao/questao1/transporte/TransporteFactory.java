package main.java.br.com.avaliacao.questao1.transporte;

/**
 * Classe abstrata do padrão Factory Method.
 * Define o método de criação de transportes.
 */
public abstract class TransporteFactory {

    public abstract Transporte criarTransporte();
}