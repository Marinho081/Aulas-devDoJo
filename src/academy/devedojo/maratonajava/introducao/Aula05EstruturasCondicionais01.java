package academy.devedojo.maratonajava.introducao;
//aula https://www.youtube.com/watch?v=gk1_Pn8GZA4&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=21
// https://www.youtube.com/watch?v=exxeNsgcg3c&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=22
public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
    // o IF só executa se o resultado da programação for verdadeiro true
    // IF tem que esta dendro de um bloco entre { }

    int age = 18;
    boolean isAuthorizedToPurchaseBeverages = age >= 18;

    if (isAuthorizedToPurchaseBeverages){
        System.out.println("thorized");
    }
    if (!isAuthorizedToPurchaseBeverages){

    System.out.println("unauthorized");}

    /*se usar o else como no exemplo abaixo não seria necessario a linha 14 a 16 o codigo utilizado na linha 14 16
    sempre sera executado sem depender o resultado do if diferente do else que  só pode ser utilizado apartir de um if*/

        int age2 = 15;
        boolean isAuthorizedToPurchaseBeverages2 = age2 >= 18;
        if(isAuthorizedToPurchaseBeverages2) {
            System.out.println("thorized");
        }else{
            System.out.println("unauthorized");

        }
    }
}
