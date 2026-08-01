package academy.devedojo.maratonajava.introducao;
// https://www.youtube.com/watch?v=exxeNsgcg3c&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=22

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args){
    //idade < 15 categoria infantil
    //idade >= 15 && idade < categoria juvenil
    //idade >=18 categoria adulto
    int age = 16;
    String category;

    if (age < 15){
        category = "children's category ";
        //executa se  ife for verdadeira

    }else if (age >= 15 && age < 18){
        category = "youth category";
        //só é checada se if for falsa
        //executa se else if for verdadeira
    } else {
        category = "adult category";
        // só executa se todas condições acima forem falsas
        //é o pegue oque sobrou
        }
        System.out.println(category);

    }

}
