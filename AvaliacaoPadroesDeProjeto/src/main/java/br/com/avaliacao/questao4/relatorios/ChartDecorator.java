package main.java.br.com.avaliacao.questao4.relatorios;

public class ChartDecorator extends ReportDecorator {

    public ChartDecorator(Report decoratedReport) {
        super(decoratedReport);
    }

    @Override
    public String generate() {
        return decoratedReport.generate() + "\n[Gráfico] Exibindo gráfico de vendas por período (simulação)\n";
    }
}