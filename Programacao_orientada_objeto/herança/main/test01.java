package Programacao_orientada_objeto.herança.main;

import Programacao_orientada_objeto.herança.dominio.Endereco;
import Programacao_orientada_objeto.herança.dominio.Funcionario;
import Programacao_orientada_objeto.herança.dominio.Pessoa;

/*Inicialização de atributos estáticos da superclasse.

Blocos estáticos da superclasse são executados.

Inicialização de atributos estáticos da subclasse.

Blocos estáticos da subclasse são executados.

Inicialização de atributos de instância da superclasse.

Blocos de inicialização da superclasse são executados.

Construtor da superclasse é chamado.

Inicialização de atributos de instância da subclasse.

Blocos de inicialização da subclasse são executados.

Construtor da subclasse é chamado. */
public class test01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("silva");
        endereco.setCep("287625-484");
        Pessoa pessoa = new Pessoa("pedro");
        pessoa.setCpf("637.828.273-82");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("maria");
        funcionario.setCpf("139.828.284-23");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1450);
        System.out.println("--------------");
        funcionario.imprime();

    }
}
