package main.java.br.com.avaliacao.questao1.transporte;

/**
 * Fábrica concreta responsável por criar transporte aéreo.
 */
public class TransporteAereoFactory extends TransporteFactory {

    @Override
    public Transporte criarTransporte() {
        return new TransporteAereo();
    }
}