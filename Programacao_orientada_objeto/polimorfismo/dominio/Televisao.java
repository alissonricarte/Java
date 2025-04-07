package Programacao_orientada_objeto.polimorfismo.dominio;

public class Televisao extends Produto {
    
    public static final double IMPOSTOS = 0.21;
    
    public Televisao(String nome, double valor){
        super(nome, valor);
    }
    @Override
    public double calcular_taxas() {
        System.out.println("Calculando taxa de imposto da Telivisão...");
        return valor * IMPOSTOS;
    }
}
