package academy.devedojo.maratonajava.javacore.Fmodificadoresestaticos.test;

import academy.devedojo.maratonajava.javacore.Fmodificadoresestaticos.dominio.Carro;

public class carroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("CIVIC", 150);
        Carro carro2 = new Carro("GOL BOLA",120);
        Carro carro3 = new Carro("MAVERIC",180);

        Carro.setVelocidadeLimite(190);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }

}
