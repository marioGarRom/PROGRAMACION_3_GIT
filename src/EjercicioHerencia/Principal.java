package EjercicioHerencia;

import EjercicioHerencia.Estudiante;
import EjercicioHerencia.Persona;

public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona("MARIO", 19, "M", "ATLACOMULCO");
        Estudiante e1 = new Estudiante("YESSI", 19, "F", "ATLACOMULCO", "839947", "Paradigmas", "A");
        e1.mostrarInfo();
        p1.mostrarInfo();
    }
}