package Poo.introducao_class.poo01.main;

import Poo.introducao_class.poo01.dominio.Estudante;

public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "José";
        estudante.idade = 20;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
    
}
