package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImprimirEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();


        estudante01.nome = "Angela";
        estudante01.idade = 28;
        estudante01.sexo = 'F';

        estudante02.nome = "Elliot";
        estudante02.idade = 29;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
