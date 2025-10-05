package main.java.br.com.avaliacao.questao1.transporte;

/**
 * Fábrica concreta responsável por criar transporte terrestre.
 */
public class TransporteTerrestreFactory extends TransporteFactory {

    @Override
    public Transporte criarTransporte() {
        return new TransporteTerrestre();
    }
}