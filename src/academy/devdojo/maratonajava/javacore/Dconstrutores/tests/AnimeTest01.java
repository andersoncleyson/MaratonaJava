package academy.devdojo.maratonajava.javacore.Dconstrutores.tests;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball", "luta", 499, "jounin");

        //anime.init("Death Note", "Suspense", 23);

        anime.imprime();

    }
}
