package Programacao_orientada_objeto.construtores.main;

import Programacao_orientada_objeto.construtores.dominio.Anime;

public class test {
    public static void main(String[] args) {
        Anime anime = new Anime("goku","tv",12,"ação", "NYA");
        anime.imprima();
    }
}