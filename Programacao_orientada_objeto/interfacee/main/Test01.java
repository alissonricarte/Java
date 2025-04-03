package Programacao_orientada_objeto.interfacee.main;

import Programacao_orientada_objeto.interfacee.dominio.DataBasaLoander;
import Programacao_orientada_objeto.interfacee.dominio.FileLoander;

public class Test01 {
    public static void main(String[] args) {
        DataBasaLoander dataBasaLoander = new DataBasaLoander();
        FileLoander fileLoander = new FileLoander();
        //Carregando do DataLoander
        dataBasaLoander.loand();
        fileLoander.loand();

        //Carregando do FileLoander
        dataBasaLoander.remove();
        fileLoander.remove();

        //Carregando do DataLoander, porém com o default pois tenha métodos com implementação padrão.
        dataBasaLoander.checkPermission();
        fileLoander.checkPermission();
        
    }
}
