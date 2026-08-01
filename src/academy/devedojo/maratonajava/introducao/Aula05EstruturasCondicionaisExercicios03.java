package academy.devedojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicios03 {
    public static void main(String[] args){
    // 0$ a 34,712 = 9.70 %
    // 34,713 a  678,507 = 37.35%
    //678,508 = 49.50%
        // CALCULAR O IMPOSTO DE RENDA ANUAL DE ACORDO COM O SALARIO. (EXERCICIO)

        double wage = 68508;
        double result =   0.097;//9.70% / 100 = 0.097
        double result2 =  0.373;// 37.35% / 100 = 0.3735
        double result3 =  0.495;// 49.50% / 100 = 0.4950
        double imposto;

        if (wage <= 34712 ){
            imposto = result * wage;

        } else if (wage >=34713 && wage <= 68507) {
            imposto = result2 * wage;

        }else {

            imposto = result3 * wage;
        }
        System.out.println("IMPOSTO A PAGAR R$"+imposto+" DE REAIS");

    }
}
