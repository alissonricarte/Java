package Programacao_orientada_objeto.Modificadores.exercio.main;

import Programacao_orientada_objeto.Modificadores.exercio.dominio.Funcionario;

public class test {
     public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("maria");
        funcionario.setIdade(20);
        funcionario.setSalario(new double []{200,200,200});

        funcionario.imprima();
    }
}
