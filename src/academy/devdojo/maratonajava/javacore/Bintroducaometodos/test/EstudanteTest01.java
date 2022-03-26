package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImprimirEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimirEstudante imprimirEstudante = new ImprimirEstudante();

        estudante01.nome = "Angela";
        estudante01.idade = 28;
        estudante01.sexo = 'F';

        estudante02.nome = "Elliot";
        estudante02.idade = 29;
        estudante02.sexo = 'M';

        imprimirEstudante.imprime(estudante01);
        imprimirEstudante.imprime(estudante02);


    }
}
