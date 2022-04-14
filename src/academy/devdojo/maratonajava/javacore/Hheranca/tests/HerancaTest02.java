package academy.devdojo.maratonajava.javacore.Hheranca.tests;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {

    // 0 - Bloco de incialização estático da super class é executado quando a JVM carregar classe pai
    // 1 - Bloco de inicialização estático da sub classe é executado quando a JVM carregar classe filha
    // 2 - Alocado o espaço em memória pro objeto da superclasse
    // 3 - Cada atributo de superclasse pai é criado e inicializado com valores default ou o que for passado da classe pai
    // 4 - Bloco de inicialização da super classe é executado na ordem em que aparece
    // 5 - Construtor é executado da superclasse
    // 6 - Alocado o espaço em memória pro objeto da subclasse
    // 7 - Cada atributo de subclasse é criado e inicializado com valores default ou o quer for passado
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 9 - Construtor da subclasse é executado
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Sagan");
    }
}
