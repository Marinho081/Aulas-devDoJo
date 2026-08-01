package academy.devedojo.maratonajava.javacore.Bintruduçãometodos.test;

import academy.devedojo.maratonajava.javacore.Bintruduçãometodos.dominio.Estudante;
import academy.devedojo.maratonajava.javacore.Bintruduçãometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Maria";
        estudante01.idade= 40;
        estudante01.sexo=  'F';

        estudante02.nome = "Joyce";
        estudante02.idade= 32;
        estudante02.sexo=  'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
