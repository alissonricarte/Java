package Poo.poo02.main;

import Poo.poo01.dominio.Estudante;
import Poo.poo02.dominio.Professor;

public class main {
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
