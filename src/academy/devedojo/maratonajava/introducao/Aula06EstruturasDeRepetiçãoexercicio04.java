package academy.devedojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetiçãoexercicio04 {
    //dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
    //condição do valor da parcela >=1000(valor carro 10000)
    public static void main(String[] args){
       double carsValue =10000 ;
             //valor do carro
       for (int installMents=1;installMents<=carsValue ; installMents++){
               //parcelas.     parcelas      valor do carro
           double installmentAmount = carsValue/installMents;
                  //valordasparcelas
           if (installmentAmount>=1000) {
               System.out.println("Parcela "+ installMents + " R$" +installmentAmount);
           }else {
               break;

           }

           }
    }
}
