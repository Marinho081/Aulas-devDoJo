package academy.devedojo.maratonajava.javacore.Bintruduçãometodos.test;

import academy.devedojo.maratonajava.javacore.Bintruduçãometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.nome = "lucas";
        //pessoa.idade = 35;
        pessoa.setNome("lucas");
        pessoa.setIdade(35);
        //pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
