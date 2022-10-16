package Extra;

public class Contador {
    private static int numeroObj;

    {
        numeroObj++;
    }

    public Contador() {
    }

    public Contador(int n) {
    }

    public Contador(String s) {
    }

    public static void main(String[] args) {
        Contador t1 = new Contador();
        Contador t5 = new Contador();
        Contador t2 = new Contador();
        System.out.println("Numero de objetos: " + Contador.numeroObj);
    }
}