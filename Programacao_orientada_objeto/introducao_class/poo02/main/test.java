package Programacao_orientada_objeto.introducao_class.poo02.main;

import Programacao_orientada_objeto.introducao_class.poo01.dominio.Estudante;
import Programacao_orientada_objeto.introducao_class.poo02.dominio.Professor;

public class test {
    public static void main(String[] args) {
    Professor professor = new Professor();
        professor.nome ="Pedro";
        professor.idade = 39;
        professor.sexo = 'M';

        Estudante estudante = new Estudante();
        estudante.nome = "José";
        estudante.idade = 20;
        estudante.sexo = 'M';

        System.out.println("Professor\n"+"Nome: "+professor.nome+" Idade: "+professor.idade+" Sexo: "+professor.sexo);
        System.out.println("Estudante\n"+"Nome: "+estudante.nome+" Idade : "+estudante.idade+" Sexo: "+estudante.sexo);
    }
}
