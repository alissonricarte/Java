package Programacao_orientada_objeto.associacoes.Unidirecional.dominio;

//Unidirecional, Muitos para 1, varios professores para uma escola
public class Escola {
    private String nome;
    private Professor[] professores;

    //Quando não tem professores disponivel
    public Escola(String nome){
        this.nome = nome;
    }
    //Quando já tem o professores dipisnivel
    public Escola(String nome, Professor[] professores){
        this.nome = nome;
        this.professores = professores;
    }
    public void imprima(){
        System.out.println("Escola: " +this.nome);
        System.out.println("Professores:");
        if(professores != null){
            for(Professor professor : professores){
                System.out.println(professor.getNome());
            }
        }
    }
    public String getNome() {
        return nome;
    }
    public Professor[] getProfessores() {
        return professores;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
