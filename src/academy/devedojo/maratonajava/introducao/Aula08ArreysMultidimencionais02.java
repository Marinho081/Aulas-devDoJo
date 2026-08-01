package academy.devedojo.maratonajava.introducao;

public class Aula08ArreysMultidimencionais02 {
    public static void main(String[] args) {
        int[]array = {1,2,3};

        int[][] arrayInteiro = new int[3][];

             arrayInteiro [0]= new int[2];
             arrayInteiro [1]= array;
             arrayInteiro [2]= new int[]{1,2,3,4,5,6};

         for (int[]arrayBase:arrayInteiro){
             for (int num:arrayBase){
                 System.out.println(num);
             }
         }
         for (int i=0; i< arrayInteiro.length;i++){
             for (int j=0;j< arrayInteiro[i].length;j++){
                 System.out.println(arrayInteiro[i][j]);
             }
         }
    }
}
