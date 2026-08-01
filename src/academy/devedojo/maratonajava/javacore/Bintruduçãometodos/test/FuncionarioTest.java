package academy.devedojo.maratonajava.javacore.Bintruduçãometodos.test;

import academy.devedojo.maratonajava.javacore.Bintruduçãometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();


        funcionario1.setNome("Lucio azevedo");
        funcionario1.setIdade(25);
        //para evitar erros vamos usar o if pois se tirar a variavel salarios ou
        //se não tiver salarios a declara nosso codigo dara erro.
       funcionario1.setSalarios(new double[]{1200, 987.32, 2000});
       funcionario1.imprime();
       //funcionario1.setMedia (3000);
        //System.out.println(funcionario1.getMedia());
        /*na classe funcionario o metodo setMedia foi retirado
        pois são metodos que não devem ser acessados para não sofrerem alterações.
        dessa maneira ela só podera ser acessada pela classe Funcionario.
         */










    }

}