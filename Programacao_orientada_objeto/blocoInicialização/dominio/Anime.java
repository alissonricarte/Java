package Programacao_orientada_objeto.blocoInicialização.dominio;

public class Anime {
    private String nome;
    private int[] episodio;
    // Bloco de inicialização
    {
        System.out.println("bloco de inicialização");
        episodio = new int[100];
        for(int cont = 0; cont < episodio.length; cont++){
            episodio[cont] = cont + 1;
        }
        for(int episodio : this.episodio){
            System.out.print(episodio+" ");
        }
        System.out.println("");

    }
    public Anime(String nome){
        this.nome = nome;
    }
    public Anime(){
        episodio = new int[100];
        for(int cont = 0; cont < episodio.length; cont++){
            episodio[cont] = cont + 1;
        }
        for(int episodio : this.episodio){
            System.out.print(episodio+" ");
        }
    }
    public String getNome() {
        return nome;
    }
    public int[] getEpisodio() {
        return episodio;
    }
}
