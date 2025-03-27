package Programacao_orientada_objeto.associacoes.Exercio.main;

import java.util.Scanner;

import Programacao_orientada_objeto.associacoes.Exercio.dominio.aluno;
import Programacao_orientada_objeto.associacoes.Exercio.dominio.local;
import Programacao_orientada_objeto.associacoes.Exercio.dominio.professor;
import Programacao_orientada_objeto.associacoes.Exercio.dominio.seminario;

public class gerenciar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Sistema de seminario ====");
        //cadastrar local 
        System.out.println("Informe o endereço do local:");
        String enderecoLocal =  scanner.nextLine();
        local local = new local(enderecoLocal);

        //cadastrar professor
        System.out.println("Informe o nome do professor");
        String nomeProfessor =  scanner.nextLine();
        System.out.println("Informe a especialidade do Professor:");
        String especialidadeProfessor =  scanner.nextLine();
        professor professor = new professor(nomeProfessor,especialidadeProfessor);

        //cadastrar aluno
        System.out.println("Informe quantos alunos são:");
        int numAluno = scanner.nextInt();
        scanner.nextLine();
        aluno[] alunosParaSeminario = new aluno[numAluno];
        for(int i = 0; i < numAluno; i++){
            System.out.println("Aluno" +(i + 1));
            System.out.println("Nome: ");
            String nomeAluno = scanner.nextLine();
            System.out.println("Idade: ");
            int idadeAluno = scanner.nextInt();
            scanner.nextLine();
            alunosParaSeminario[i] = new aluno(nomeAluno, idadeAluno);
        }
        //Cadastrar seminario
        System.out.println("Informe o Titulo do seminario:");
        String tituloSeminario = scanner.nextLine();
        seminario seminario = new seminario(tituloSeminario, alunosParaSeminario, local);

        seminario[] seminariosDiponivel = {seminario}; 

        professor.setSeminarios(seminariosDiponivel); 

        System.out.println("==== Informações do cadastros");
        professor.imprime();

        scanner.close();
    }
}
