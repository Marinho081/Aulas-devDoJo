package academy.devedojo.maratonajava.javacore.Gassociacao.Test;

import academy.devedojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class jogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Cafu");
        // variavel de referencia array.
         Jogador [] jogadores = new Jogador[]{jogador1,jogador2,jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }


    }



}
