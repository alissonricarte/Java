package Arrys;

public class Arrys02 {
    //byte,short, int, long, float e double 0
    // char '\u0000'
    //boolean false
    //string null
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "goku";
        nomes[1] = "corola";
        nomes[2] = "celta";
        //length  = tamanho da string
        for(int cont = 0; cont < nomes.length; cont++){
            System.out.println(nomes[cont]);
        }
    }
}