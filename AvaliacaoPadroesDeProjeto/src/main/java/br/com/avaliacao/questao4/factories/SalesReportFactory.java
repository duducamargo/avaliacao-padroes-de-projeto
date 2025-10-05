package main.java.br.com.avaliacao.questao4.factories;

import java.util.List;

import main.java.br.com.avaliacao.questao4.relatorios.BasicReport;
import main.java.br.com.avaliacao.questao4.relatorios.Report;

/**
 * Fábrica concreta para criar relatórios de vendas.
 */
public class SalesReportFactory extends ReportFactory {

    @Override
    public Report createReport() {
        List<String> pedidos = List.of(
                "Pedido #101 - R$150.00",
                "Pedido #102 - R$249.90",
                "Pedido #103 - R$89.00");
        return new BasicReport(pedidos);
    }
}