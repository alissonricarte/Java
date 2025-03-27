package Programacao_orientada_objeto.associacoes.Exercio.dominio;

public class seminario {
    private String titulo;
    private aluno[] alunos;
    private local local;

    public seminario(String titulo){
        this.titulo = titulo;
    }
    public seminario(String titulo, aluno[] alunos){
        this.titulo = titulo;
        this.alunos = alunos;
    }
    public seminario(String titulo, aluno[] alunos, local local){
        this(titulo, alunos);
        this.local = local;
    }
    public String getTitulo() {
        return titulo;
    }
    public aluno[] getAlunos() {
        return alunos;
    }
    public local getLocal() {
        return local;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAlunos(aluno[] alunos) {
        this.alunos = alunos;
    }
    public void setLocal(local local) {
        this.local = local;
    }
}
