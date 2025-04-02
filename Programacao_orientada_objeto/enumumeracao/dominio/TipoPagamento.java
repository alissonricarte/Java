package Programacao_orientada_objeto.enumumeracao.dominio;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1; //VAlOR = 100
        }
    },CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public  abstract double calcularDesconto(double valor);
}
