package academy.devedojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args ){
        int [] number = new int [3];
          number [0] = 1;
          number [1] = 2;
          number [2] = 3;
        String [] name = new String[3];
          name [0] = "lucas";
          name [1] = "arthur";
          name [2] = "joyce";
          int [] number3 = new int[]{1,2,3,4,5};
        /*for(int i = 0; i < number.length; i++ ){
            System.out.println(number[i] +name[i]);}*/
        for (String num: name){
            System.out.println(num);
        }
        for (int num: number){
            System.out.println(num);
        }
    }
}
