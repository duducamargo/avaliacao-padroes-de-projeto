package main.java.br.com.avaliacao.questao5.documentos;

/**
 * Modelo de proposta comercial.
 */
public class ProposalTemplate extends BaseDocument {

    public ProposalTemplate() {
        this.titulo = "Modelo de Proposta Comercial";
    }

    @Override
    public String render() {
        return "[Proposta] " + titulo + "\nCliente: " + cliente +
                "\nCor: " + cor + "\nFonte: " + fonte + "\nLogo: " + logo + "\n";
    }
}