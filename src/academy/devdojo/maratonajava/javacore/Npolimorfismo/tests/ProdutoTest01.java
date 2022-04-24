package academy.devdojo.maratonajava.javacore.Npolimorfismo.tests;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("2AM", 5000);
        Tomate tomate = new Tomate("Tomate", 2);
        Televisao televisao = new Televisao("LG 50\" ", 2500);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("==========================");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("==========================");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
