package main.java.br.com.avaliacao.questao4.relatorios;

/**
 * Classe base abstrata para todos os Decorators.
 */
public abstract class ReportDecorator implements Report {
    protected final Report decoratedReport;

    protected ReportDecorator(Report decoratedReport) {
        this.decoratedReport = decoratedReport;
    }
}