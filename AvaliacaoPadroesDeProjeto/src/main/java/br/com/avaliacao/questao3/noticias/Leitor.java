package main.java.br.com.avaliacao.questao3.noticias;

public class Leitor implements Observer {

    private final String nome;

    public Leitor(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String topico, Noticia noticia) {
        System.out.println( nome + " recebeu notificação de [" + topico + "]: "
                + noticia.getTitulo() + " (" + noticia.getLink() + ")");
    }
}