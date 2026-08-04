package academy.devedojo.maratonajava.javacore.Hherança.Test;

import academy.devedojo.maratonajava.javacore.Hherança.Dominio.Funcionario;

public class HerançaTes02 {
    //0-o bloco de inicialização STATIC da super classe  é executado quando a jvm carrega a classe pai(classe Pessoa).
    //1-o bloco de inicialização STATIC da sub classe  é executado quando a jvm carrega a classe filha(classe Funcionario).
    //2-aloca espaço em memoria pro objeto da super classe.(classe Pessoa)
    //3-cada atributo de superclasse (classe Pessoa) é criado e inicializados com valores defalt ou o que for passado.
    //4-bloco de inicialização da superclasse(classe Pessoa) é executado na orden em que aparece.
    //5-costrutor é executado da superclasse (classe Pessoa)
    //6-aloca espaço em memoria pro objeto da  subclasse.(classe Funcionario)
    //7-cada atributo de subrclasse (classe Funcionario) é criado e inicializados com valores defalt ou o que for passado.
    //8-bloco de inicialização da subclasse(classe Funcionario) é executado na orden em que aparece.
    //9-costrutor é executado da subclasse (classe Funcionario)
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("lucas");
        funcionario.getSlario();
        System.out.println("salario"+funcionario.getSlario());
    }

}
