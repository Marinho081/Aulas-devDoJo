package academy.devedojo.maratonajava.javacore.Hherança.Test;

import academy.devedojo.maratonajava.javacore.Hherança.Dominio.Endereco;
import academy.devedojo.maratonajava.javacore.Hherança.Dominio.Funcionario;
import academy.devedojo.maratonajava.javacore.Hherança.Dominio.Pessoa;

public class HeramcaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua das criolas");
        endereco.setCep("5060-70010");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("booby");
        pessoa.setCpf("096.105.502.45");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("lufy");
        funcionario.setCpf("02112545677");
        funcionario.setEndereco(endereco);
        funcionario.setSlario(2000);
        System.out.println("------------------------");
         funcionario.imprime();
    }
}
