package Programacao_orientada_objeto.associacoes.dominio;

public class jogador {
    private String nome;
    private Time time;

    public void imprima(){
        System.out.println(this.nome);
        if(time != null){
            System.out.println(time.getNome());
        }
    }
    public jogador(String nome){
        this.nome = nome;
    }
    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
