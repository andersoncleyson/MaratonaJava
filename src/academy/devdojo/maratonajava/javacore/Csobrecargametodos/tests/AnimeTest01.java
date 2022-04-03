package academy.devdojo.maratonajava.javacore.Csobrecargametodos.tests;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Death Note", "Suspense", 23);
        anime.init("Death note", "suspense", 22, "Anime");

        anime.imprime();
    }
}
