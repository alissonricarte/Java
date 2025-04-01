package Programacao_orientada_objeto.modificadorFinal.dominio;

public class Comprador {
    private String nome;

    @Override
    public String toString(){
        return "Comprdor: " +this.nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
