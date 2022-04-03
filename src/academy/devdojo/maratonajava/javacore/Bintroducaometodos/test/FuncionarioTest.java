package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Elliot");
        funcionario.setIdade(28);
        funcionario.setSalario(new double[] {3203.23, 3231.22, 3213.32});

        funcionario.imprime();
        System.out.println("");
        funcionario.imprimeMedia();
    }
}
