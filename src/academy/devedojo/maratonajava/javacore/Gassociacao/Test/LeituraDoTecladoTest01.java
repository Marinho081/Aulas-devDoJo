package academy.devedojo.maratonajava.javacore.Gassociacao.Test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite seu nome abaixo");
        String nome = entrada.nextLine();
        System.out.println("digite sua idade");
        int idade = entrada.nextInt();
        System.out.println("digite M para masculino ou F para feminino");
        char sexo = entrada.next().charAt(0);
        System.out.println("-----------------------------------");
        System.out.println("nome =" +nome);
        System.out.println("idade =" +idade);
        System.out.println("sexo =" +sexo);
    }
}
