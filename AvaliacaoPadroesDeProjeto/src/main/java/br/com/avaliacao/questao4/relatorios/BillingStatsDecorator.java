package main.java.br.com.avaliacao.questao4.relatorios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Adiciona estatísticas de faturamento ao relatório.
 */
public class BillingStatsDecorator extends ReportDecorator {

    public BillingStatsDecorator(Report decoratedReport) {
        super(decoratedReport);
    }

    @Override
    public String generate() {
        String content = decoratedReport.generate();
        double total = 0.0;

        Matcher matcher = Pattern.compile("R\\$(\\d+(?:\\.\\d{1,2})?)").matcher(content);
        while (matcher.find()) {
            total += Double.parseDouble(matcher.group(1));
        }

        return content + "\n[Estatísticas] Faturamento total: R$" + String.format("%.2f", total) + "\n";
    }
}