package academy.devedojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        int number01 = 10;
        int number02 = 20;
        //--- OPERADORES ARITMÉTICOS BÁSICOS ---
        //subitração: 20 - 10 = 10
        System.out.println(number02-number01);
        //soma: 20+10 = 30
        System.out.println(number02+number01);
        //--- O PERIGO DA STRING E CONCATENAÇÃO ---
        //Regra de ouro: Se houver uma String na operação, o '+' vira concatenação.

        //Se a String estiver no FINAL, a soma dos números acontece primeiro:
        //10 + 20 = 30 -> depois concatena "valor" -> Resultado: "30valor"
        System.out.println(number02+number01+" valor");

        //Se a String estiver no INICIO, a concatenação acontece imediatamente:
        //"valor" + 10 -> vira "valor10"
        /*"valor10" + 20 -> vira "valor1020" (O 20 não é somado, é apenas colado
         como texto)*/
        System.out.println("valo"+number02+number01);
        // --- DIVISÃO ENTRE INTEIROS ---
        // Atenção: Divisão de dois inteiros resulta em um inteiro (parte decimal é descartada).
        // 10/20= 0.5 matematicamente mas o java retorna 0
        System.out.println(number01/number02);

        //Para obter o resultado decimal (0.5), precisamos forçar um dos operandos a ser double:
        //(double) nemero01 converte o 10 para 10.0 antes da divisão
        System.out.println((double)number01/number02);
        //            ---RESTO---
        //resto no java é representado pelo sinal de %
        // com ele podemos saber se o resultado entre 2 numeros sera impar(1) ou par(0)
        /*O operador resto (ou módulo) em Java é representado pelo símbolo % (porcentagem).
        De forma bem simples: ele não te diz quantas vezes um número cabe no outro.
        Ele te diz quanto sobra depois da divisão inteira.Como funciona na prática:
        Imagine que você tem 10 balas e quer dividir igualmente entre 3 amigos.
        Cada amigo pega 3 balas (porque 10 / 3 = 3).
        Você usou 3 * 3 = 9 balas no total.
        Quantas balas sobraram? 1.
        Em Java: 10 % 3 resulta em 1.*/
        int resto1 = 20%2;//sobra 0  par
        int resto2 = 21%2;//sobra 1 impar
        System.out.println(resto1);
        System.out.println(resto2);
        //---PARA QUE SERVE ?
        /*Esse operador é super útil para duas coisas principais:
         1-Descobrir se um número é par ou ímpar:
         Se numero % 2 for igual a 0, o número é par.
         Se numero % 2 for igual a 1, o número é ímpar.

         2-Fazer algo a cada X vezes (Ciclo)
         Imagine um jogo que dá um prêmio a cada 5 pontos.
         Você verifica: if (pontos % 5 == 0) { darPrêmio(); }.
         Só quando o resto for 0 (exatos múltiplos de 5) o prêmio é dado.*/
        // < menor q, > maior q, <= menor ou igual, => maior ou igual
        //== igual, != diferente

        //--- BOOLEAN
        // verdadeiro true ou falso false
        boolean isDezMaiorQue20 = 10>20;
        boolean isDezMenorQue20 = 10<20;
        boolean isDezIgualA20 = 10==20;
        boolean isDezIgualA10 = 10==10;
        boolean isDezDiferenteDe20 = 10!=20;
        System.out.println(isDezMaiorQue20);
        System.out.println(isDezMenorQue20);
        System.out.println(isDezIgualA20);
        System.out.println(isDezIgualA10);
        System.out.println(isDezDiferenteDe20);
        //---OPERADORES LOJICOS
        //são eles &&(AND), ||(or), !(negassão)

        //--- AND &&
        int age = 35;
        float wage = 3500F;
        boolean isDentroDaLeiMaiorQue30 = age > 30 && wage >= 4612;
        boolean isDentroDaLeiMenorQue30 = age < 30 && wage >= 3381;
        System.out.println("isDentroDaLeiMaior30"+isDentroDaLeiMaiorQue30);
        System.out.println("isDentroDaLeiMenor30"+isDentroDaLeiMenorQue30);

        //---OR ||
        double totalCurrentAccountValue = 200;
        double totalValueSavingsAccount = 10000;
        float valueOfPlayStation = 5000F;
        boolean buyAblePlayStation5 = totalCurrentAccountValue > valueOfPlayStation|| totalValueSavingsAccount > valueOfPlayStation;
        System.out.println("buyAblePlayStation5"+buyAblePlayStation5);

        //--OPERADORES DE ATRIBUIÇÃO atribui algo a sua variavel
        //são eles: =; +=, -=; /=, *= e %=

        double bonus = 1800;
        /*ae no caso eu quiser criar um sistema que adicione um valor a esses 1800
        eu não poderia utilizar doubole bonus = 1000 pois daria erro pois teria duas variaveis com mesmo nome e nem
        assim double bonus = 1800+1000, pq dessa maneira estaria gravando na memoria no codigo esse valor ficaria fixo*/
        //--- MANEIRA CORRETA
        bonus = bonus + 1000;
        //podemos abreviar usando os operadores de atribuição
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //++, --
        int couter = 0;
        couter += 1;
        //ou abreviando usando ++ ou --
        couter ++;
        couter --;
        ++couter ;
        --couter ;
        System.out.println(couter);

        //o sinal do operado vindo antes ele adiciona 1 a variavel e depois multiplica
        int couter2 = 10;
        int result = ++couter2 * 2;// resultado 22
        System.out.println(result);

        /* sinal do operador vindo depois da variavel ele faz a operação e  executa na tela,
          depois adiciona 1 a variavel e guarda esse novo valor para proxima operação*/
        int couter3 = 10;
        int result3 = couter3++ * 2;//resultado 20
        //result3 = ++couter3 * 2;  sendo esse o proximo linha do codigo  resultado 10+1= 11, 11+1=12 * 2
        System.out.println(result3);


    }
 }
