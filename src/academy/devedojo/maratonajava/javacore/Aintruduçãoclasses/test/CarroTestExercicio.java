package academy.devedojo.maratonajava.javacore.Aintruduçãoclasses.test;

import academy.devedojo.maratonajava.javacore.Aintruduçãoclasses.dominio.Carro;

public class CarroTestExercicio {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Ford Maverick";
        carro1.modelo = "Classico";
        carro1.ano = 1973;

        carro2.nome = "Ford Maverick";
        carro2.modelo = "Picap";
        carro2.ano = 1979;

        System.out.println("Nome: "+carro1.nome+"--- Modelo: "+carro1.modelo+"---- Ano: "+carro1.ano);
        System.out.println("--------------------");
        System.out.println("Nome: "+carro2.nome+"--- Modelo: "+carro2.modelo+"---- Ano: "+carro2.ano);




    }
}
