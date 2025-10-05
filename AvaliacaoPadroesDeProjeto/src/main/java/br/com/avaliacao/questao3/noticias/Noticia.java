package main.java.br.com.avaliacao.questao3.noticias;

/**
 * Classe simples que representa uma notícia publicada.
 */
public class Noticia {
    private final String titulo;
    private final String conteudo;
    private final String link;

    public Noticia(String titulo, String conteudo, String link) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.link = link;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getLink() {
        return link;
    }
}