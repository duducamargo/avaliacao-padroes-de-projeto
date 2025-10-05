package main.java.br.com.avaliacao.questao3.noticias;

import java.util.ArrayList;
import java.util.List;

public class Topico implements Subject {

    private final String nome;
    private final List<Observer> observadores = new ArrayList<>();

    public Topico(String nome) {
        this.nome = nome;
    }

    @Override
    public void registerObserver(Observer observer) {
        observadores.add(observer);
        System.out.println("Leitor inscrito no tópico: " + nome);
    }

    @Override
    public void removeObserver(Observer observer) {
        observadores.remove(observer);
        System.out.println("Leitor removido do tópico: " + nome);
    }

    @Override
    public void notifyObservers(Noticia noticia) {
        for (Observer obs : observadores) {
            obs.update(nome, noticia);
        }
    }

    public void publicarNoticia(Noticia noticia) {
        System.out.println("\nNova notícia publicada em [" + nome + "]: " + noticia.getTitulo());
        notifyObservers(noticia);
    }

    public String getNome() {
        return nome;
    }
}