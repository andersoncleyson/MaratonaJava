package academy.devdojo.maratonajava.javacore.JmodificadorFinal.tests;

import academy.devdojo.maratonajava.javacore.JmodificadorFinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.JmodificadorFinal.dominio.Comprador;
import academy.devdojo.maratonajava.javacore.JmodificadorFinal.dominio.Subaru;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);

        carro.COMPRADOR.setNome("Irvin");

        System.out.println(carro.COMPRADOR);

        Subaru subaru = new Subaru();

        subaru.setNome("Bumblebee");
        subaru.imprime();
    }
}
