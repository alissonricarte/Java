package Programacao_orientada_objeto.modificadorStatic.main;

import Programacao_orientada_objeto.modificadorStatic.dominio.Carro;

public class test {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 300);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audio", 290);
        c1.imprima();
        c2.imprima();
        c3.imprima();
    }
}
