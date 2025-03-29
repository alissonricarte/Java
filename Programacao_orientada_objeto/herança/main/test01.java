package Programacao_orientada_objeto.herança.main;

import Programacao_orientada_objeto.herança.dominio.Endereco;
import Programacao_orientada_objeto.herança.dominio.Funcionario;
import Programacao_orientada_objeto.herança.dominio.Pessoa;

public class test01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("silva");
        endereco.setCep("287625-484");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("pedro");
        pessoa.setCpf("637.828.273-82");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("maria");
        funcionario.setCpf("139.828.284-23");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1450);
        System.out.println("--------------");
        funcionario.imprime();

    }
}
