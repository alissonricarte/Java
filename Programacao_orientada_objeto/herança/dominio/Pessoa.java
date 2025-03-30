package Programacao_orientada_objeto.herança.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public  Pessoa(String nome){
        this.nome = nome;
    }
    public Pessoa(String nome ,String cpf){
        this(nome);
        this.cpf = cpf;
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.getEndereco().getRua() + " " + this.getEndereco().getCep());
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
