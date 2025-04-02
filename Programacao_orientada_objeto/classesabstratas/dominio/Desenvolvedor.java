package Programacao_orientada_objeto.classesabstratas.dominio;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario){
        super(nome, salario);
    }
    @Override
    public void calcularBonus() {
        this.salario = this.salario + this.salario * 0.1;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{ nome = "+this.nome+", salario = "+this.salario+"}";
    }
}
