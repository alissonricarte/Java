package Programacao_orientada_objeto.introducao_metodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;
    
    public void imprima(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
