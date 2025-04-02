package Programacao_orientada_objeto.classesabstratas.main;

import Programacao_orientada_objeto.classesabstratas.dominio.Desenvolvedor;
import Programacao_orientada_objeto.classesabstratas.dominio.Gerente;

public class Test01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Maria", 7200);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Laura", 15000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
