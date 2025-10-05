package main.java.br.com.avaliacao.questao3.noticias;

public interface Observer {
    void update(String topico, Noticia noticia);
}