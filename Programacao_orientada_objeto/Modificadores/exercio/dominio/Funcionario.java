package Programacao_orientada_objeto.Modificadores.exercio.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media = 0;
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
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setSalario(double []salario){
        this.salario = salario;
    }
    public void media(double media){
        this.media = media;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double [] getSalario(){
        return salario;
    }
    public double getMedia(){
        return media;
    }
}
