package Programacao_orientada_objeto.interfacee.dominio;

public interface DataLoander {

    void loand();

    default void checkPermission(){
        System.out.println("Checando permissões...");
    }
}
