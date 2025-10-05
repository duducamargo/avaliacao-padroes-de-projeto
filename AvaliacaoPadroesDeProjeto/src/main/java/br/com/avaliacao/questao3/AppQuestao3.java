package main.java.br.com.avaliacao.questao3;

import main.java.br.com.avaliacao.questao3.noticias.Leitor;
import main.java.br.com.avaliacao.questao3.noticias.Noticia;
import main.java.br.com.avaliacao.questao3.noticias.Topico;
import main.java.br.com.avaliacao.questao3.servidor.NewsServer;

public class AppQuestao3 {

    public static void main(String[] args) {

        NewsServer server = NewsServer.getInstance();

        Topico politica = server.getOrCreateTopico("Política");
        Topico esportes = server.getOrCreateTopico("Esportes");
        Topico tecnologia = server.getOrCreateTopico("Tecnologia");

        Leitor ana = new Leitor("Ana");
        Leitor bruno = new Leitor("Bruno");
        Leitor carla = new Leitor("Carla");

        politica.registerObserver(ana);
        politica.registerObserver(bruno);
        esportes.registerObserver(bruno);
        tecnologia.registerObserver(carla);
        tecnologia.registerObserver(ana);

        server.publicar("Política", new Noticia(
                "Reforma aprovada no Congresso",
                "O Congresso Nacional aprovou nova medida econômica.",
                "https://site.com/politica/reforma"));

        server.publicar("Tecnologia", new Noticia(
                "Nova IA supera recordes",
                "Pesquisadores anunciam avanço inédito em IA generativa.",
                "https://site.com/tecnologia/ia"));

        server.publicar("Esportes", new Noticia(
                "Brasil vence campeonato",
                "A seleção brasileira conquistou o título internacional.",
                "https://site.com/esportes/brasil-campeao"));
    }
}