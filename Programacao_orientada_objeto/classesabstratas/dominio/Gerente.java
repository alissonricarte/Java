package Programacao_orientada_objeto.classesabstratas.dominio;

public class Gerente extends Funcionario {
    public Gerente(String nome , double salario){
        super(nome,salario);
    }
    @Override
    public void calcularBonus(){
        this.salario = this.salario + this.salario * 0.07;
    }
    @Override
    public String toString() {
        
        return "Gerente{ nome = "+this.nome+", salario = "+this.salario+"}"; 
    }
}
