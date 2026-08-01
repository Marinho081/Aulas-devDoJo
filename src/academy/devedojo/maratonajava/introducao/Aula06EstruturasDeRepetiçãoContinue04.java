package academy.devedojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetiçãoContinue04 {
    public static void main(String[] args){
        /*for (int i=0; i<20;i++){
            System.out.println("antes do if"+i);
            if(i<10){
                continue;
            }
            System.out.println("fim da interação"+i);} */
         double carsValue = 30000;
         for (int installMents = (int) carsValue;installMents>=1;installMents--){
             double installmentAmount = carsValue/installMents;
             if (installmentAmount < 1000){
                 continue;
             }
             System.out.println("installMents " + installMents+"R$ " + installmentAmount);
         }
    }
}
