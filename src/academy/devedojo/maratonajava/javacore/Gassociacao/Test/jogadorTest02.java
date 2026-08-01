package academy.devedojo.maratonajava.javacore.Gassociacao.Test;

import academy.devedojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devedojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class jogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Sport Recife");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
