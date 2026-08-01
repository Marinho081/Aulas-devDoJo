package academy.devedojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição01 {
    public static void main(String[] args) {
        int count = 0;
        while (count <= 50) {
            System.out.println(count+++"l");
        }
       do {
           System.out.println("f");
       }while (count < 50);
       for (int i =0; i < 10; i++){
           System.out.println("fim"+i++);

       }
    }
}
