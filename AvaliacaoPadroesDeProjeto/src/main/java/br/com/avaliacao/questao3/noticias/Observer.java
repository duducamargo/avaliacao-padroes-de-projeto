package main.java.br.com.avaliacao.questao3.noticias;

/**
 * Interface do padrão Observer.
 * Representa o assinante que será notificado quando uma notícia for publicada.
 */
public interface Observer {
    void update(String topico, Noticia noticia);
}