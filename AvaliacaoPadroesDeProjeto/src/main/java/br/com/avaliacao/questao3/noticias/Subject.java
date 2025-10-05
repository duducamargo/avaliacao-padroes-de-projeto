package main.java.br.com.avaliacao.questao3.noticias;

/**
 * Interface do padrão Observer.
 * Representa o tópico (subject) que gerencia uma lista de observadores.
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(Noticia noticia);
}