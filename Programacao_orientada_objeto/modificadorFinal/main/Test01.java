package Programacao_orientada_objeto.modificadorFinal.main;

import Programacao_orientada_objeto.modificadorFinal.dominio.Carro;

public class Test01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("pedro");
        System.out.println(carro.COMPRADOR);
    }
}
