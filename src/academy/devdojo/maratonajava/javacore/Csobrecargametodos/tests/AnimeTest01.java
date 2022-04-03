package academy.devdojo.maratonajava.javacore.Csobrecargametodos.tests;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.setNome("Naruto");
        anime.setTipo("Shipudden");
        anime.setEpisodios(20);

        anime.imprime();
    }
}
