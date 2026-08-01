package academy.devedojo.maratonajava.javacore.Gassociacao.Test;

import academy.devedojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devedojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devedojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devedojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("estrada de aldeia");
        Aluno aluno = new Aluno("lucas", 35);
        Professor professor = new Professor("lula", "tecnologia");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Programação", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }
}
