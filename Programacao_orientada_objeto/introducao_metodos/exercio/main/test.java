package Programacao_orientada_objeto.introducao_metodos.exercio.main;

import Programacao_orientada_objeto.introducao_metodos.exercio.dominio.Funcionario;

public class test {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "maria";
        funcionario.idade = 27;
        funcionario.salario =new double[] {200,200,200};

        funcionario.imprima();
    }
}
