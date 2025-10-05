package main.java.br.com.avaliacao.questao3.noticias;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Noticia noticia);
}