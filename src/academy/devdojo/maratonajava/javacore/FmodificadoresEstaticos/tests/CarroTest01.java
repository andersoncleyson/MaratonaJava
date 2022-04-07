package academy.devdojo.maratonajava.javacore.FmodificadoresEstaticos.tests;

import academy.devdojo.maratonajava.javacore.FmodificadoresEstaticos.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Ferrari", 300);


        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
