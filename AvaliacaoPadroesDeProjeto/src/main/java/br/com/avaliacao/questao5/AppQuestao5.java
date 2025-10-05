package main.java.br.com.avaliacao.questao5;

import main.java.br.com.avaliacao.questao5.documentos.DocumentPrototype;
import main.java.br.com.avaliacao.questao5.documentos.ProposalTemplate;
import main.java.br.com.avaliacao.questao5.documentos.PrototypeRegistry;
import main.java.br.com.avaliacao.questao5.documentos.ReportTemplate;
import main.java.br.com.avaliacao.questao5.documentos.ResumeTemplate;

public class AppQuestao5 {

    public static void main(String[] args) {

        PrototypeRegistry registry = PrototypeRegistry.getInstance();

        registry.registerPrototype("curriculo", new ResumeTemplate());
        registry.registerPrototype("proposta", new ProposalTemplate());
        registry.registerPrototype("relatorio", new ReportTemplate());

        registry.listarModelos();

        DocumentPrototype doc1 = registry.createFromPrototype("curriculo");
        doc1.setCliente("Maria Silva");
        doc1.setCor("Azul");
        doc1.setFonte("Calibri");
        doc1.setLogo("logo_maria.png");

        DocumentPrototype doc2 = registry.createFromPrototype("proposta");
        doc2.setCliente("TechCorp Ltda");
        doc2.setCor("Verde");
        doc2.setFonte("Helvetica");
        doc2.setLogo("logo_techcorp.png");

        DocumentPrototype doc3 = registry.createFromPrototype("relatorio");
        doc3.setCliente("Construtora Alpha");
        doc3.setCor("Cinza");
        doc3.setFonte("Times New Roman");
        doc3.setLogo("logo_alpha.png");

        System.out.println("\n=== DOCUMENTOS GERADOS ===\n");
        System.out.println(doc1.render());
        System.out.println(doc2.render());
        System.out.println(doc3.render());
    }
}