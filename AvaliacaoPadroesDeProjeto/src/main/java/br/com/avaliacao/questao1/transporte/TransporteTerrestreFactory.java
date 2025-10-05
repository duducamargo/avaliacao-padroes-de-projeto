package main.java.br.com.avaliacao.questao1.transporte;

public class TransporteTerrestreFactory extends TransporteFactory {

    @Override
    public Transporte criarTransporte() {
        return new TransporteTerrestre();
    }
}