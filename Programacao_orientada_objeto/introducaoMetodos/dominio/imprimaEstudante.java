package Programacao_orientada_objeto.introducaoMetodos.dominio;

public class imprimaEstudante {
    public void imprima(Estudante estudante){
        System.out.println("---------------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
