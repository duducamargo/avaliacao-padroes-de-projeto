package main.java.br.com.avaliacao.questao4;

import main.java.br.com.avaliacao.questao4.factories.ReportFactory;
import main.java.br.com.avaliacao.questao4.factories.SalesReportFactory;
import main.java.br.com.avaliacao.questao4.relatorios.BillingStatsDecorator;
import main.java.br.com.avaliacao.questao4.relatorios.ChartDecorator;
import main.java.br.com.avaliacao.questao4.relatorios.PdfExportDecorator;
import main.java.br.com.avaliacao.questao4.relatorios.Report;

public class AppQuestao4 {

    public static void main(String[] args) {

        ReportFactory factory = new SalesReportFactory();
        Report basicReport = factory.createReport();

        Report decoratedReport = new BillingStatsDecorator(basicReport);
        decoratedReport = new ChartDecorator(decoratedReport);
        decoratedReport = new PdfExportDecorator(decoratedReport);

        System.out.println("=== RELATÓRIO GERADO ===\n");
        System.out.println(decoratedReport.generate());
    }
}