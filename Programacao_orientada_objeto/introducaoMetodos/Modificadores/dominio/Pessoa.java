package Programacao_orientada_objeto.introducaoMetodos.Modificadores.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprimi(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        if (idade < 0) {
            System.out.println("idade ivalidade");
            return;
        }
        this.idade = idade;
    }
    public String geString(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
}
