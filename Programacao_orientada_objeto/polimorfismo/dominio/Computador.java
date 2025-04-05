package Programacao_orientada_objeto.polimorfismo.dominio;

public class Computador  extends Produto{

    public static final double IMPOSTOS = 0.21;

    public Computador(String nome,  double valor){
        super(nome, valor);
    }
    @Override
    public double calcular_taxas() {
        System.out.println("Calculando taxa de imposto do Computador...");
        return valor * IMPOSTOS;
    }
}
