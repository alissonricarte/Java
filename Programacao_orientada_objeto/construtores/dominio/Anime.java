package Programacao_orientada_objeto.construtores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodio;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int espisodio, String genero){
        this.nome = nome;
        this.tipo = tipo;    
        this.episodio = espisodio;
        this.genero = genero;
    }
    public Anime(String nome, String tipo, int espisodio, String genero,String estudio){
        this(nome, tipo, espisodio, genero);
        this.estudio = estudio;
    }
    /*public void init(String nome,String tipo, int episodio){
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;
    }
    public void init(String nome,String tipo, int episodio,String genero){
        this.init(nome, tipo, episodio);
        this.genero = genero;
    }*///tá sendo subistituido pelo o costrutor que é "puclic anime"
    public void imprima(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodio);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    } 
    public String getNome(){
        return this.nome;
    }
    public String getTipo(){
        return this.tipo;
    }
    public int getEpisodio(){
        return this.episodio;
    }
    public String getGenero(){
        return this.genero;
    }
    public String getEstudio(){
        return this.estudio;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setEpisodio(int episodio){
        this.episodio = episodio;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setEstudio(String estudio){
        this.estudio = estudio;
    }
}
