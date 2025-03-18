package Programacao_orientada_objeto.introducao_metodos.poo06;

import Programacao_orientada_objeto.introducao_metodos.dominio.Calculadora;

public class teste {
    public static void main(String[] args) {
        Calculadora calculadora01 = new Calculadora();
        int [] numeros = {1,2,3,4,5};
        calculadora01.somaArry(numeros);
        calculadora01.somaVarArgs(1,2,3,4,5,6,7);
    }
}
