package academy.devedojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[]args){
        //doar se salario for maior que > 5000

        double wage = 100;
             //salario
        String massageDonate = "i'm Going To Donate 500 to devdojo";// eu vou dor 500 pro devdojo
             //mensagemDoar

        String doNtDonaite   = "i don't have the means yet, but i will eventually !";//ainda não tenho condições, mas vou ter!
             //nãodoar

        String result;
            // resultado
        if (wage > 5000){
            result = massageDonate;

        }else{
            result = doNtDonaite;
        }
        System.out.println(result);

        //---OPERADOR TERNÁRIO
        /* Quando NÃO usar o Operador Ternário (Evite excessos)
         Se você tentar forçar o ternário para coisas complexas,
         o código se torna ilegível ("código spaguetti").
         Cenários proibidos/péssimos:
         Múltiplas linhas: Se precisar executar mais de uma instrução
        (ex: imprimir algo E atualizar uma variável).*/

        int age = 10;

        String result2 = (age>17)? " doar": "não doar";
        System.out.println(result2);
        //nesse caso vimos que o bloco de codigo ficou bem resumido












    }
}
