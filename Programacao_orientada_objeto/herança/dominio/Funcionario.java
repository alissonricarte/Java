package Programacao_orientada_objeto.herança.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome){
        super(nome);
    }
    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }
    public void imprimeRelatorio(){
        System.out.println("EU: "+this.nome+ " RECEBIR: "+this.salario);
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
