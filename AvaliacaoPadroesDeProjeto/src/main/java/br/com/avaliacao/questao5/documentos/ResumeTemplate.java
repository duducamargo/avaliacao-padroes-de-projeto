package main.java.br.com.avaliacao.questao5.documentos;

/**
 * Modelo de currículo profissional.
 */
public class ResumeTemplate extends BaseDocument {

    public ResumeTemplate() {
        this.titulo = "Modelo de Currículo";
    }

    @Override
    public String render() {
        return "[Currículo] " + titulo + "\nCliente: " + cliente +
                "\nCor: " + cor + "\nFonte: " + fonte + "\nLogo: " + logo + "\n";
    }
}