package Programacao_orientada_objeto.polimorfismo.main;

import Programacao_orientada_objeto.polimorfismo.dominio.Computador;
import Programacao_orientada_objeto.polimorfismo.dominio.Tomate;
import Programacao_orientada_objeto.polimorfismo.servico.CalculadoraImposto;

public class test01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Dell G15", 7500);
        Tomate tomate = new Tomate("Tomate cereja", 9);
        CalculadoraImposto.calculadoraImpostoComputador(computador);
        System.out.println("=============================");
        CalculadoraImposto.calculadoraImpostoTomate(tomate);
    }
}
