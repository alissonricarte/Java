package Programacao_orientada_objeto.modificadorStatic.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadelimite = 250;
    
    public Carro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public void imprima(){
        System.out.println("--------------------------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade Maxima: "+this.velocidadeMaxima);
        System.out.println("Velocidade minima "+Carro.velocidadelimite);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public void setVelocidademinima(double velocidadelimite) {
        Carro.velocidadelimite = velocidadelimite;
    }
    public String getNome() {
        return nome;
    }
    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public double getVelocidadelimite() {
        return velocidadelimite;
    }
}
