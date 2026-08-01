package academy.devedojo.maratonajava.javacore.Gassociacao.Test;

import academy.devedojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devedojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor [] professors = {professor1,professor2};
        Escola escola = new Escola("Konoha", professors);

        escola.imprime();
    }
}
