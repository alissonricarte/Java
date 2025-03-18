package Programacao_orientada_objeto.Modificadores.poo01;

import Programacao_orientada_objeto.Modificadores.dominio.Pessoa;

public class test {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        System.out.println("Com Set:");
        pessoa.setNome("joão");
        pessoa.setIdade(19);
        pessoa.imprimi();
        System.out.println("Com Get:");
        System.out.println(pessoa.geString());
        System.out.println(pessoa.getIdade());
    }
}
