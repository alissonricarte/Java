package estrutura_repeticao;

public class exercio4 {
    public static void main(String[] args) {
       double valortotal = 30000;
        for(int parcela = (int)valortotal;  parcela >= 1; parcela--){
        double vaolorparcela = valortotal / parcela;
        if(vaolorparcela < 1000){
            continue;
        }
        System.out.println("parcela "+ parcela + " R$"+vaolorparcela);
    }
}
}