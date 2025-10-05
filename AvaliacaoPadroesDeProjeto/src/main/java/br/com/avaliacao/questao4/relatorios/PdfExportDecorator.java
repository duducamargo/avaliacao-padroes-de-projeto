package main.java.br.com.avaliacao.questao4.relatorios;

public class PdfExportDecorator extends ReportDecorator {

    public PdfExportDecorator(Report decoratedReport) {
        super(decoratedReport);
    }

    @Override
    public String generate() {
        return decoratedReport.generate() + "\n[Exportação] Relatório exportado em formato PDF (simulação)\n";
    }
}