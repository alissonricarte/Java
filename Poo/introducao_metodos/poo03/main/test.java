package Poo.introducao_metodos.poo03.main;

import Poo.introducao_metodos.dominio.Calculadora;

public class test {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividirDoisValores(20, 2);
        System.out.println(result);
        System.out.println(calculadora.dividirDoisValores(20, 2));
    }
}
