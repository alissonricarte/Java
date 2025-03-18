package Programacao_orientada_objeto.introducao_metodos.poo04;

import Programacao_orientada_objeto.introducao_metodos.dominio.Estudante;
import Programacao_orientada_objeto.introducao_metodos.dominio.imprimaEstudante;

public class teste {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        imprimaEstudante imprimaEstudante = new imprimaEstudante();

        estudante01.nome = "pedro";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria";
        estudante02.idade = 17;
        estudante02.sexo = 'F';

        imprimaEstudante.imprima(estudante01);
        imprimaEstudante.imprima(estudante02);
}
}
