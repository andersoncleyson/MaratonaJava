package academy.devdojo.maratonajava.javacore.Gassociacao.tests;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Av. Las Vegas");

        Aluno aluno = new Aluno("Anderson", 26);
        Aluno aluno2 = new Aluno("Angela", 25);

        Professor professor = new Professor("Sagan", "Cosmologia");

        Aluno[] alunosParaSeminario = {aluno, aluno2};
        Seminario seminario = new Seminario("Pálido ponto azul", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
