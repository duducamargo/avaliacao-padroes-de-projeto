package main.java.br.com.avaliacao.questao5.documentos;

/**
 * Classe base para documentos que implementa a lógica de clonagem e
 * personalização.
 */
public abstract class BaseDocument implements DocumentPrototype {

    protected String titulo;
    protected String cliente = "Padrão";
    protected String cor = "Preto";
    protected String fonte = "Arial";
    protected String logo = "default.png";

    @Override
    public DocumentPrototype clone() {
        try {
            return (DocumentPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Erro ao clonar documento: " + e.getMessage());
        }
    }

    @Override
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    @Override
    public void setLogo(String logo) {
        this.logo = logo;
    }
}