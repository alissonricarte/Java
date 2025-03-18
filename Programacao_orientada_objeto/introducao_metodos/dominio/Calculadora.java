package Programacao_orientada_objeto.introducao_metodos.dominio;

public class Calculadora {

    public void somaDoisValores() {
        System.out.println(10 + 10);
    }
    public void multiplicarDoisValores(int num1, int num2) {
        System.out.println(num1 * num2);
    }
    public double dividirDoisValores(double num1, double num2){
        return num1 / num2;
    }
    public void somaArry(int []num){
        int soma = 0;
        for(int cont : num){
            soma += cont;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int...num){
        int soma = 0;
        for(int cont : num){
            soma += cont;
        }
        System.out.println(soma);
    }
}
