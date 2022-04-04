package academy.devdojo.maratonajava.javacore.EblocosDeInicializacao.tests;

import academy.devdojo.maratonajava.javacore.EblocosDeInicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto");

        for (int episodio : anime.getEpisodios()){
            System.out.println(episodio + " ");
        }
    }
}
