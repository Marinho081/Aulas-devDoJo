package academy.devedojo.maratonajava.javacore.Aintruduçãoclasses.test;

import academy.devedojo.maratonajava.javacore.Aintruduçãoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "bastião";
        professor.idade = 70;
        professor.sexo ='M';
        System.out.println("Nome: "+professor.nome+" Idade: "+professor.idade+" sexo: "+professor.sexo );
    }
}
