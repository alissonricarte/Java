package Programacao_orientada_objeto.associacoes.Unidirecional.main.test03;

import Programacao_orientada_objeto.associacoes.Unidirecional.dominio.Escola;
import Programacao_orientada_objeto.associacoes.Unidirecional.dominio.Professor;

public class test {
    public static void main(String[] args) {
        Professor professor1 = new Professor("joão");
        Professor professor2 = new Professor("maria");
        Professor[] professores = { professor1,professor2};
        Escola escola = new Escola("Don Pedro II", professores);
        escola.imprima();

    }
}
