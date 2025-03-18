package Programacao_orientada_objeto.introducao_metodos.poo05;

import Programacao_orientada_objeto.introducao_metodos.dominio.Estudante;


public class teste {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "pedro";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria";
        estudante02.idade = 17;
        estudante02.sexo = 'F';

        estudante01.imprima();
        estudante02.imprima();
    }
}
