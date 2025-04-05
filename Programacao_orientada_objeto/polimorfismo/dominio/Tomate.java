package Programacao_orientada_objeto.polimorfismo.dominio;

public class Tomate extends Produto {

    public static final double IMPOSTOS = 0.05;

    public Tomate(String nome, double valor){
        super(nome, valor);
    }
    @Override
    public double calcular_taxas() {
        System.out.println("Calculando taxa de imposto do Tomate...");
        return valor * IMPOSTOS;
    }
}
