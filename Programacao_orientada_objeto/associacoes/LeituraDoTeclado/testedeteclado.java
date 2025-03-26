package Programacao_orientada_objeto.associacoes.LeituraDoTeclado;

import java.util.Scanner;

//Next = pega só a primeira palavra "pedro santos" vai pegar só o "pedro"
//NextLine = pega completo 
public class testedeteclado {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        System.out.println("Informe seu nome abaixo:");
        String nome = entrada.nextLine();
        System.out.println("informe sua idade:");
        int idade = entrada.nextInt();
        System.out.println("Informe M ou F para seu sexo:");
        char sexo = entrada.next().charAt(0);
        System.out.println("------------------------");
        System.out.println("Nome :"+nome);
        System.out.println("Idade :"+idade);
        System.out.println("Sexo :"+sexo);

        entrada.close();
    }
}
