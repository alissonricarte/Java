package Programacao_orientada_objeto.associacoes.Exercio.dominio;

public class aluno {
    private String nome;
    private int idade;
    private seminario seminario;

    public aluno(String nome, int idade){
        this.nome = nome;
        this.idade =  idade;
    }
    public aluno(String nome, int idade, seminario seminario){
        this(nome, idade);
        this.seminario = seminario;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public seminario getSeminario() {
        return seminario;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSeminario(seminario seminario) {
        this.seminario = seminario;
    }
  
}
