package main.java.br.com.avaliacao.questao4.relatorios;

import java.util.List;

/**
 * Implementação básica do relatório, contendo apenas a lista de pedidos.
 */
public class BasicReport implements Report {

    private final List<String> pedidos;

    public BasicReport(List<String> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder("=== RELATÓRIO BÁSICO ===\n");
        for (String pedido : pedidos) {
            sb.append("- ").append(pedido).append("\n");
        }
        return sb.toString();
    }
}