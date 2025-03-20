package Programacao_orientada_objeto.introducaoMetodos.poo03.main;

import Programacao_orientada_objeto.introducaoMetodos.dominio.Calculadora;

public class test {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividirDoisValores(20, 2);
        System.out.println(result);
        System.out.println(calculadora.dividirDoisValores(20, 2));
    }
}
