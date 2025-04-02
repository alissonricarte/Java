package Programacao_orientada_objeto.enumumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1,"pessoa fisica"),
    PESSOA_JURIDICA(2,"pessoa juridica");

    private int VALOR;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio){
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }
    public static TipoCliente tipoClientePorRelatorio(String nomeRelatorio){
        for(TipoCliente tipoCliente : values()){
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }
    public int getVALOR() {
         return VALOR;
    }
    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    
}
