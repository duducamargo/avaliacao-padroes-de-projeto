package main.java.br.com.avaliacao.questao4;

import main.java.br.com.avaliacao.questao4.factories.ReportFactory;
import main.java.br.com.avaliacao.questao4.factories.SalesReportFactory;
import main.java.br.com.avaliacao.questao4.relatorios.BillingStatsDecorator;
import main.java.br.com.avaliacao.questao4.relatorios.ChartDecorator;
import main.java.br.com.avaliacao.questao4.relatorios.PdfExportDecorator;
import main.java.br.com.avaliacao.questao4.relatorios.Report;

/**
 * Classe principal da Questão 4.
 * Demonstra o uso dos padrões Decorator e Factory Method.
 */
public class AppQuestao4 {

    public static void main(String[] args) {

        // Criação do relatório básico via Factory Method
        ReportFactory factory = new SalesReportFactory();
        Report basicReport = factory.createReport();

        // Adicionando decoradores dinamicamente
        Report decoratedReport = new BillingStatsDecorator(basicReport);
        decoratedReport = new ChartDecorator(decoratedReport);
        decoratedReport = new PdfExportDecorator(decoratedReport);

        // Geração do relatório final
        System.out.println("=== RELATÓRIO GERADO ===\n");
        System.out.println(decoratedReport.generate());
    }
}