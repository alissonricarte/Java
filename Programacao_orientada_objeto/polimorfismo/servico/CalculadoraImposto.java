package Programacao_orientada_objeto.polimorfismo.servico;

//import Programacao_orientada_objeto.polimorfismo.dominio.Computador;
import Programacao_orientada_objeto.polimorfismo.dominio.Produto;
//import Programacao_orientada_objeto.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    /*public static void calculadoraImpostoComputador(Computador computador){
        System.out.println("<RELATORIO DE IMPOSTO DO COMPUTADOR>");
        double imposto = computador.calcular_taxas();
        System.out.println("Computador: "+computador.getNome());
        System.out.println("Valor: "+computador.getValor());
        System.out.println("Imposto: "+imposto);
    }
    public static void calculadoraImpostoTomate(Tomate tomate){
        System.out.println("<RELATORIO DE IMPOSTO DO TOMATE>");
        double imposto = tomate.calcular_taxas();
        System.out.println("Computador: "+tomate.getNome());
        System.out.println("Valor: "+tomate.getValor());
        System.out.println("Imposto: "+imposto);
    }*/
    //isso é a mesma coisa de cima
    public static void calcularImposto(Produto produto){
        System.out.println("<RELATORIO DE IMPOSTO>");
        double imposto = produto.calcular_taxas();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Preço: "+produto.getValor());
        System.out.println("Imposto a ser pago : "+imposto);
    }
}
