package main.java.br.com.avaliacao.questao1;

import main.java.br.com.avaliacao.questao1.servico.CalculadoraTarifas;
import main.java.br.com.avaliacao.questao1.transporte.*;

/**
 * Classe principal de execução da Questão 1.
 * Demonstra o uso do padrão Factory Method + Singleton.
 */
public class AppQuestao1 {

    public static void main(String[] args) {

        TransporteFactory terrestreFactory = new TransporteTerrestreFactory();
        TransporteFactory aereoFactory = new TransporteAereoFactory();
        TransporteFactory maritimoFactory = new TransporteMaritimoFactory();

        Transporte terrestre = terrestreFactory.criarTransporte();
        Transporte aereo = aereoFactory.criarTransporte();
        Transporte maritimo = maritimoFactory.criarTransporte();

        CalculadoraTarifas calculadora = CalculadoraTarifas.getInstance();

        double valorTerrestre = calculadora.calcular(terrestre, 800, 300);
        double valorAereo = calculadora.calcular(aereo, 1200, 150);
        double valorMaritimo = calculadora.calcular(maritimo, 5000, 2000);

        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("%s: R$ %.2f%n", terrestre.getNome(), valorTerrestre);
        System.out.printf("%s: R$ %.2f%n", aereo.getNome(), valorAereo);
        System.out.printf("%s: R$ %.2f%n", maritimo.getNome(), valorMaritimo);
    }
}