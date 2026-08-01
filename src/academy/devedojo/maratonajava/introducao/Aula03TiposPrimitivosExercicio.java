package academy.devedojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args){
        /*cri variaveis para os campos descritos a baixo entre<> e imprima a seguinte mensagem
        eu<nome>, morando no endereço <endereço>,
        confirme que recebi o salário de<salario>, na data<data>
         */
        String endereço = "no Endereço: estrada de alkdeia KM 07,";
        String nome = "Eu Lucas Marinho Fernandes, morando" ;
        String dataRecebimentoSalario = "na data: 15/05/2026";
        double salarioDouble = 2000 ;
        System.out.println(nome);
        System.out.println(endereço);
        System.out.println("confirmo que recebi  "+ salarioDouble +" de salario");
        System.out.println(dataRecebimentoSalario);
    }
}
