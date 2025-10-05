package main.java.br.com.avaliacao.questao4.factories;

import java.util.List;

import main.java.br.com.avaliacao.questao4.relatorios.BasicReport;
import main.java.br.com.avaliacao.questao4.relatorios.Report;

/**
 * Fábrica concreta para criar relatórios de clientes.
 */
public class CustomerReportFactory extends ReportFactory {

    @Override
    public Report createReport() {
        List<String> clientes = List.of(
                "Cliente A - 5 pedidos",
                "Cliente B - 3 pedidos",
                "Cliente C - 10 pedidos");
        return new BasicReport(clientes);
    }
}