package academy.devdojo.maratonajava.javacore.Npolimorfismo.tests;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryen 7", 3000);// <- OBJETO

        Tomate tomate = new Tomate("Tomate", 2);// <- OBJETO
        tomate.setDataValidade("05/09/2015");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("====================");
        CalculadoraImposto.calcularImposto(produto);


    }
}
