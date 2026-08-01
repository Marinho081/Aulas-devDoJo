package academy.devedojo.maratonajava.javacore.Csobrecargasmetodos.test;

import academy.devedojo.maratonajava.javacore.Csobrecargasmetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        //anime.setNome("one piece");
        //anime.setTipo("TV");
        //anime.setEpisodios(12);
        anime.init("one piece", "TV", 12);
        anime.init("one piece", "TV", 12, "Aventura");
        anime.imprime();
    }
}
