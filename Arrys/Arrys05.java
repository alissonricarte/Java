package Arrys;

public class Arrys05 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        //inicializar 
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];
        
        for(int[] arrayBase : arrayInt){
            System.out.println("-----");
            for(int num : arrayBase){
                System.out.println(num);
            }
        }
    }
}
