package academy.devedojo.maratonajava.javacore.Jmodificadorfinal.Test;

import academy.devedojo.maratonajava.javacore.Jmodificadorfinal.Dominio.Carro;
import academy.devedojo.maratonajava.javacore.Jmodificadorfinal.Dominio.Comprador;
import academy.devedojo.maratonajava.javacore.Jmodificadorfinal.Dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
       Carro carro = new Carro();
        //não é aconcelhavel acessar VELOCIDADE_LIMITE DESSA MANEIRA (carro.VELOCIDADE_LIMITE).
        /* variaves extaticas não devem ser acessadas via instância variavel de referencia do objeto e sim pelo nome
         da classe ex (Carro.VELOCIDADE_LIMITE)
         a variavel (public  static final double VELOCIDADE_LIMITE = 250;) seria como o numero 250 deve
         como um numero não sendo possivel atribuir nem um valor a ela */
       carro.velocidade = 500;
        System.out.println(carro.velocidade-Carro.VELOCIDADE_LIMITE);
        //exemplo acima para ajudar no entendimento.

        //MODIFICADOR FINAL DO TIPO REFERÊNCIA EXEMPLO
        System.out.println(carro.COMPRADOR);//a referencia já foi criada é (new Comprador)
        // aqui ele mostra como null pois  a variavel NOME dA CLASSE  comprador ainda
        //não tem um valor.

        //DANDO UM VALOR A VARIAVEL NOME DA CLASSE COMPRADOR
        carro.COMPRADOR.setNome("pedro");
        System.out.println(carro.COMPRADOR);

        //CLASSE FERRARI EXTENDE A CLASSE CARRO COM METODO IMPRIME USANDO O MODIFICADOR FINAL
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Ferrari");//setNome VINDO DA CLASSE CARRO
        ferrari.imprime();


    }
}
