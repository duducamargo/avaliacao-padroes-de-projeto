package main.java.br.com.avaliacao.questao1.transporte;

public class TransporteAereoFactory extends TransporteFactory {

    @Override
    public Transporte criarTransporte() {
        return new TransporteAereo();
    }
}