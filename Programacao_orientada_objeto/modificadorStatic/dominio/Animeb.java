package Programacao_orientada_objeto.modificadorStatic.dominio;

public class Animeb {
    private String nome;
    private static int[] episodio;
    // Bloco de inicialização
    {
        System.out.println("bloco de inicialização");
        episodio = new int[100];
        for(int cont = 0; cont < episodio.length; cont++){
            episodio[cont] = cont + 1;
        }
        for(int episodio : Animeb.episodio){
            System.out.print(episodio+" ");
        }
        System.out.println("");

    }
    public Animeb(){
        episodio = new int[100];
        for(int cont = 0; cont < episodio.length; cont++){
            episodio[cont] = cont + 1;
        }
        for(int episodio :Animeb.episodio){
            System.out.print(episodio+" ");
        }
    }
    public Animeb(String nome){
        this.nome = nome;
    }    
    public String getNome() {
        return nome;
    }
    public int[] getEpisodio() {
        return episodio;
    }
}


