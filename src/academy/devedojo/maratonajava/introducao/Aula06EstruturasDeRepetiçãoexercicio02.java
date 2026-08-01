package academy.devedojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetiçãoexercicio02 {
    //imprima todos os numeros pares de 0 a 1000000.
    public static void main(String[] ergs) {
        for (long i=0;i<1000000;i++){
            System.out.println(i+++"l");
        }
        int a= 0;
        while (a<100){
            System.out.println(a);
            System.out.println(++a);
        }
    }
}