package ManejoDeErrores;

public class Principal {
    public static void main(String[] args) {
        int[] numero={1,2,3};
        System.out.println("valor:");
        try {
            System.out.println(numero[3]);
        }catch (Exception e){
            System.out.println("Hay un error en del codigo");
        }
        System.out.println("FINAL");
        try {
            System.out.println(numero[5]);
        }catch (java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}