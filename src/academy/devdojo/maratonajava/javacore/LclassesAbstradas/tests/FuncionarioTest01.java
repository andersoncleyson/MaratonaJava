package academy.devdojo.maratonajava.javacore.LclassesAbstradas.tests;

import academy.devdojo.maratonajava.javacore.LclassesAbstradas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.LclassesAbstradas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Angela", 4000);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Elliot", 20000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);

        desenvolvedor.imprime();
    }
}
