package academy.devedojo.maratonajava.introducao;

public class Aula08ArreysMultidimencionais01 {
    public static void main(String[] args) {
        int[][] day = new int[4][3];
        //LINHA 0
        day [0][0] = 31;
        day [0][1] = 28;
        day [0][2] = 30;
        //LINHA 1
        day [1][0] = 31;
        day [1][1] = 28;
        day [1][2] = 30;
        //LINHA 2
        day [2][0] = 31;
        day [2][1] = 28;
        day [2][2] = 30;
        //LINHA 3
        day [3][0] = 31;
        day [3][1] = 28;
        day [3][2] = 30;

       for (int i= 0; i <  day.length; i++) {
           System.out.println("----------");
            for (int j=0; j < day[i].length; j++){
                System.out.print(day[i][j]);

        }
        }
        System.out.println("----------");
        for (int [] arrayBase: day){
            for (int num: arrayBase){
                System.out.print(num);
            }
        }
    }
}
