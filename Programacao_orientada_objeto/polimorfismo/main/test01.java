package Programacao_orientada_objeto.polimorfismo.main;

import Programacao_orientada_objeto.polimorfismo.dominio.Computador;
import Programacao_orientada_objeto.polimorfismo.dominio.Televisao;
import Programacao_orientada_objeto.polimorfismo.dominio.Tomate;
import Programacao_orientada_objeto.polimorfismo.servico.CalculadoraImposto;

public class test01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Dell G15", 7500);
        Tomate tomate = new Tomate("Tomate cereja", 9);
        Televisao tv = new Televisao("LG", 2780);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("=============================");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("=============================");
        CalculadoraImposto.calcularImposto(tv);
    }
}
