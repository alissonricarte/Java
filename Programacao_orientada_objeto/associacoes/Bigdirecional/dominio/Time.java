package Programacao_orientada_objeto.associacoes.Bigdirecional.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprima() {
        System.out.println(this.nome);
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }
    }
    public String getNome() {
        return nome;
    }
    public Jogador[] getJogadores() {
        return jogadores;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
