package Programacao_orientada_objeto.sobreCargaMetodos.main;

import Programacao_orientada_objeto.sobreCargaMetodos.dominio.Anime;

public class test {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("naruto", "tv", 12,"ação");
        anime.imprima();
    }
}
