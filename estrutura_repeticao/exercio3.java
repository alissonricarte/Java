package estrutura_repeticao;

public class exercio3 {
    public static void main(String[] args) {
       double valortotal = 30000;
       for(int parcela = 1;  parcela <= valortotal; parcela++){
        double vaolorparcela = valortotal / parcela;
        if(vaolorparcela >= 1000){
            System.out.println("parcela "+ parcela + " R$"+vaolorparcela);
        }else{
            break;
        }
       }  
    }
    
}
