package Programacao_orientada_objeto.enumumeracao.main;

import Programacao_orientada_objeto.enumumeracao.dominio.Cliente;
import Programacao_orientada_objeto.enumumeracao.dominio.TipoCliente;
import Programacao_orientada_objeto.enumumeracao.dominio.TipoPagamento;

public class Test01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("pedro",TipoCliente.PESSOA_FISICA,TipoPagamento.CREDITO);
        Cliente cliente2 =  new Cliente("maria", TipoCliente.PESSOA_JURIDICA,TipoPagamento.DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorRelatorio("pessoa fisica");
        System.out.println(tipoCliente2);
    }
}
