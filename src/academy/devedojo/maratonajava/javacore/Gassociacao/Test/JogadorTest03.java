package academy.devedojo.maratonajava.javacore.Gassociacao.Test;

import academy.devedojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devedojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("cafu");
        Jogador jogador2 = new Jogador("pele");
        Time time = new Time("vitoria da bahia");


        Jogador [] jogadores = {jogador,jogador2};


        time.setJogadores(jogadores);

        jogador.setTime(time);
        jogador2.setTime(time);



        System.out.println("---Jogador---");

        jogador.imprime();
        jogador2.imprime();



        System.out.println("---Time---");

        time.imprime();

    }
}
