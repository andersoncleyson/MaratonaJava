package academy.devdojo.maratonajava.javacore.Gassociacao.tests;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Arraxca");
        Jogador jogador2 = new Jogador("Vini Malvadeza");
        Time time = new Time("Flamengo");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("------------ Jogadores----------");
        jogador.imprime();
        System.out.println("--------- Time -----------");
        time.imprime();
    }
}
