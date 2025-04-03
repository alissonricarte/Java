package Programacao_orientada_objeto.interfacee.dominio;

public class DataBasaLoander  implements DataLoander, DataRemover{
    @Override
    public void loand() {
        System.out.println("Carregando dados do banco de dados...");
    }
    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados...");
    }
}
