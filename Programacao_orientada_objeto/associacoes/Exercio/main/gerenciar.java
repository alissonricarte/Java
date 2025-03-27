package Programacao_orientada_objeto.associacoes.Exercio.main;

import Programacao_orientada_objeto.associacoes.Exercio.dominio.aluno;
import Programacao_orientada_objeto.associacoes.Exercio.dominio.local;
import Programacao_orientada_objeto.associacoes.Exercio.dominio.professor;
import Programacao_orientada_objeto.associacoes.Exercio.dominio.seminario;

public class gerenciar {
    public static void main(String[] args) {
        local local = new local("centro");
        aluno aluno = new aluno("pedro ", 29);
        professor professor = new professor("joão", "dançarino");

        aluno[] alunosParaSeminario = {};

        seminario seminario = new seminario("one pice", alunosParaSeminario, local);

        seminario[] seminariosDiponivel = {seminario}; 

        professor.setSeminarios(seminariosDiponivel); 

        professor.imprime();
    }
}
