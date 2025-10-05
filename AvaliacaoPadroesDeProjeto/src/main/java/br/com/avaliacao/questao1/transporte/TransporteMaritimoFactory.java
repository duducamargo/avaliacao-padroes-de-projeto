package main.java.br.com.avaliacao.questao1.transporte;

/**
 * Fábrica concreta responsável por criar transporte marítimo.
 */

public class TransporteMaritimoFactory extends TransporteFactory {

    @Override
    public Transporte criarTransporte() {
        return new TransporteMaritimo();
    }
}