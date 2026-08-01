package academy.devedojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04Exercicio {
    public static void main(String[] args){
        // utilizando switch dado os valores de 1 a 7, imprima se é dia util ou final de semana
        // considere 1 como domingo
        byte dia = 1;
        switch (dia){
            case 1  :
                System.out.println("Final de semana ");
                break;
            case 2 :
                System.out.println("dia util");
                break;
            case 3 :
                System.out.println("dia util");
                break;
            case 4 :
                System.out.println("dia util");
                break;
            case 5 :
                System.out.println("dia util");
                break;
            case 6 :
                System.out.println("dia util");
                break;
            case 7 :
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Opção invalida");
        }

        // outra maneir5a de fazer o exercicio a cima.

        byte dia2 = 5;

        switch (dia2){
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
            default:
                System.out.println("opção invalida");
        }

    }
}
