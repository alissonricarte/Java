package Programacao_orientada_objeto.associacoes.Exercio.dominio;

public class professor {
    private String nome;
    private String especialidade;
    private seminario[] seminarios;

    public professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public professor(String nome, String especialidade, seminario[] seminarios){
        this(nome, especialidade);
        this.seminarios = seminarios;
    }
    public void imprime(){
        System.out.println("-----------");
        System.out.println("Professor: "+ this.nome);
        System.out.println("Especialidade: "+this.especialidade);
        if(seminarios != null){
            System.out.println("##Seminarios Disponivel##");
            for(seminario seminario : this.seminarios){
                System.out.println("Endereço: "+seminario.getLocal().getEnderreso());
                System.out.println("Titulo: "+seminario.getTitulo());
                if (seminario.getAlunos() != null && seminario.getAlunos().length > 0) {
                    System.out.println("##alunos##");
                    for(aluno aluno : seminario.getAlunos()){
                        System.out.println("Nome: "+aluno.getNome()+" Idade: "+aluno.getIdade());
                    }
                }
            }

        }
    }
    public String getNome() {
        return nome;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public seminario[] getSeminarios() {
        return seminarios;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public void setSeminarios(seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
