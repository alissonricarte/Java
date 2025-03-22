package Programacao_orientada_objeto.modificadorStatic.main;

import Programacao_orientada_objeto.modificadorStatic.dominio.Carro;

public class test {
    public static void main(String[] args) {
        //altera todos valores de velocidade limite, na class Carro passei ele = 250 e depois  alterie para 180
        Carro.setvelocidadelimite(180);
        Carro c1 = new Carro("BMW", 300);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audio", 290);

        c1.imprima();
        c2.imprima();
        c3.imprima();
    }
}
