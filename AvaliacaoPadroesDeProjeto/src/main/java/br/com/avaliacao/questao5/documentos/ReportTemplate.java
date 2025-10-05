package main.java.br.com.avaliacao.questao5.documentos;

public class ReportTemplate extends BaseDocument {

    public ReportTemplate() {
        this.titulo = "Modelo de Relatório Técnico";
    }

    @Override
    public String render() {
        return "[Relatório] " + titulo + "\nCliente: " + cliente +
                "\nCor: " + cor + "\nFonte: " + fonte + "\nLogo: " + logo + "\n";
    }
}