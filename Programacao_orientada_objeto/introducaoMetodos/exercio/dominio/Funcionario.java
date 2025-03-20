package Programacao_orientada_objeto.introducaoMetodos.exercio.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public double mediaSalario(){
        if(salario == null || salario.length == 0) {
            return 0;
        }
        double soma = 0;
        for(double i : salario){
            soma += i;
        }
        return soma / salario.length;
    }
    public void imprima(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(double i: this.salario){
        System.out.println(i + " ");
        }
        System.out.println("Media do salario:"+this.mediaSalario());
        
    }
}
