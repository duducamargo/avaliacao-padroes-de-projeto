package main.java.br.com.avaliacao.questao5.documentos;

public interface DocumentPrototype extends Cloneable {

    DocumentPrototype clone();

    void setCliente(String cliente);

    void setCor(String cor);

    void setFonte(String fonte);

    void setLogo(String logo);

    String render();
}