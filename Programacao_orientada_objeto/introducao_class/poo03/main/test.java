package Programacao_orientada_objeto.introducao_class.poo03.main;

import Programacao_orientada_objeto.introducao_class.poo03.dominio.carro;

public class test {
    public static void main(String[] args) {
        carro carro01 = new carro();
        carro carro02 = new carro();

        carro01.nome = "celta";
        carro01.modelo = "chervolet";
        carro01.valor = 20000;

        carro02.nome = "corrola";
        carro02.modelo = "toyota";
        carro02.valor = 70000;

        System.out.println("Carro 1:");
        System.out.println(carro01.nome);
        System.out.println(carro01.modelo);
        System.out.println(carro01.valor);
        System.out.println("----------------------");
        System.out.println("Carro 2:");
        System.out.println(carro02.nome);
        System.out.println(carro02.modelo);
        System.out.println(carro02.valor);
    }
}
