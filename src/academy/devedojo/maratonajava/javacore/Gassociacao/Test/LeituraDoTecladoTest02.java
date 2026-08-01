package academy.devedojo.maratonajava.javacore.Gassociacao.Test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma pergunta e receba sim ou não");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0)== ' '){
            System.out.println("SIM");
        }else {
            System.out.println("NÃO");
        }
    }
}
