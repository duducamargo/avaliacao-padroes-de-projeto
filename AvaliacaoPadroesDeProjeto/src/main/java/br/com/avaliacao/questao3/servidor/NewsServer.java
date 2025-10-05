package main.java.br.com.avaliacao.questao3.servidor;

import java.util.HashMap;
import java.util.Map;

import main.java.br.com.avaliacao.questao3.noticias.Noticia;
import main.java.br.com.avaliacao.questao3.noticias.Topico;

public class NewsServer {

    private static NewsServer instance;
    private final Map<String, Topico> topicos = new HashMap<>();

    private NewsServer() {
    }

    public static NewsServer getInstance() {
        if (instance == null) {
            instance = new NewsServer();
        }
        return instance;
    }

    public Topico getOrCreateTopico(String nome) {
        return topicos.computeIfAbsent(nome, Topico::new);
    }

    public void publicar(String nomeTopico, Noticia noticia) {
        Topico topico = getOrCreateTopico(nomeTopico);
        topico.publicarNoticia(noticia);
    }
}