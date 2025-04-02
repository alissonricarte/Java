package Programacao_orientada_objeto.enumumeracao.dominio;


public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente){
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }
    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento){
        this(nome, tipoCliente);
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{"+"NOME: "+this.nome+
        " TIPO: "+this.tipoCliente+ 
        " TIPOint :"+ 
        " PAGAMENTO: "+this.tipoPagamento+"}";
    }
    
    public String getNome() {
        return nome;
    }
    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }
    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
