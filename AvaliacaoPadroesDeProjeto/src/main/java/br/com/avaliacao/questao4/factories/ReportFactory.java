package main.java.br.com.avaliacao.questao4.factories;

import main.java.br.com.avaliacao.questao4.relatorios.Report;

/**
 * Classe base do Factory Method para criação de relatórios básicos.
 */
public abstract class ReportFactory {
    public abstract Report createReport();
}