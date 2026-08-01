package academy.devedojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, shorts, long, boolean
        int age = 10;
        long largeNumber = 100000;
        byte idadeByte = -128;
        //age significa idade estou tentando deixar tudo em ingles
        /* Tudo o que estiver entre as aspas duplas é tratado
         como uma String (uma sequência de letras)O computador não tenta executar nada que esteja lá dentro*/
        //o sinal de = relaciona o que esta a direita com o que ta a esquerda
        double salarioDouble = 2000;
        float  salarioFloat = 2500;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        //caractere precisa esta em aspas simples
        String nome = " Letras maiusculas pode ser um grande texto ";
        System.out.println("a idade é " + age +" anos");
        // int, long, byte numeros inteiros
        //double, float,  numeros decimais
        //boolean verdadeiro ou falso
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println(nome);
        //casting https://www.youtube.com/watch?v=74hd4o7V328&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=13
    }
}



