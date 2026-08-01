package academy.devedojo.maratonajava.javacore.Bintruduçãometodos.test;

import academy.devedojo.maratonajava.javacore.Bintruduçãometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Maria";
        estudante01.idade= 40;
        estudante01.sexo=  'F';

        estudante02.nome = "Joyce";
        estudante02.idade= 32;
        estudante02.sexo=  'F';

        estudante01.Imprime();
        estudante02.Imprime();
    }
}
