package academy.devedojo.maratonajava.javacore.Aintruduçãoclasses.test;

import academy.devedojo.maratonajava.javacore.Aintruduçãoclasses.dominio.Estudante;

public class EstudanTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
         estudante2.nome = "Maria";
         estudante2.idade= 40;
         estudante2.sexo=  'F';

        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(",--------------");
        System.out.println(estudante2.idade);
        System.out.println(estudante2.nome);
        System.out.println(estudante2.sexo);
    }
}
