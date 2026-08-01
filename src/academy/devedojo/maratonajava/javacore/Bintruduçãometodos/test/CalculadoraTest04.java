package academy.devedojo.maratonajava.javacore.Bintruduçãometodos.test;

import academy.devedojo.maratonajava.javacore.Bintruduçãometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1=2;
        int num2=3;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println(num1+"--"+num2);
    }
}
