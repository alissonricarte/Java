package Programacao_orientada_objeto.interfacee.dominio;

public class FileLoander implements DataLoander, DataRemover {
    @Override
    public void loand() {
        System.out.println("Carregando dados do arquivo...");
    }
    @Override
    public void remove() {
        System.out.println("Removendo dados do arquivo...");
    }
    //sobreescreveu
    @Override
    public void checkPermission() {
        System.out.println("Checando permissões do arquivo...");
    }
}
