package Extra;

public class clase1 {
    private String mensaje="Hola";

    public static void main(String[] args) {
        clase1 obj1=new clase1();
        clase1 obj2=new clase1();
        obj2.mensaje="mundo";
        System.out.println(obj1.mensaje);
        System.out.println(obj2.mensaje);

    }
}