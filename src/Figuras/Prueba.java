package Figuras;

public class Prueba {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(5, 5, 3);
        System.out.println(t1.toString());
        Cuadrado c1 = new Cuadrado(1.5);
        System.out.println(c1.toString());
        Circulo s2 = new Circulo(10);
        System.out.println(s2.toString());
    }
}