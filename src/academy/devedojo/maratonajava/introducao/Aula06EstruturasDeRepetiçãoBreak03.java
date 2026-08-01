package academy.devedojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetiçãoBreak03 {
    //a intenção desse bloco foi fazer com que em um lço(loop) que vai até 50 só
    // fosse imprimido os primiros 25. geralmente precissa de um IF para dizer quando essa interação deve acontecer
    public static void main(String[] args){
        int maximoValue = 50;
        for (int i=0;i <= maximoValue;i++){
            if (i>25) {
             break;
            } System.out.println(i+"l");

        }
    }
}
