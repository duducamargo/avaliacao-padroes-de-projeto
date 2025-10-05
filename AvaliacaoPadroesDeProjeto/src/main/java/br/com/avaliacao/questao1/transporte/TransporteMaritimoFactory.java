package main.java.br.com.avaliacao.questao1.transporte;

public class TransporteMaritimoFactory extends TransporteFactory {

    @Override
    public Transporte criarTransporte() {
        return new TransporteMaritimo();
    }
}