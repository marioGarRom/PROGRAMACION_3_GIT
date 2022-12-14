package EjercicioHerencia;

import Interfaces.*;

public class Estudiante extends Persona implements IntAlumno1, IntAlumno2 {
    private String noCuenta;
    private String curso;
    private String calificacion;

    public Estudiante() {
        super("YESSI", 19, "F", "ATLACOMULCO");
    }

    public Estudiante(String nombre, int edad, String sexo, String direccion, String
            noCuenta, String curso, String calificacion) {
        super(nombre, edad, sexo, direccion);
        this.noCuenta = noCuenta;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public String getCurso() {
        return curso;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void verCalificacion() {
        System.out.println("La calificacion de " + getNombre() + " es" + calificacion);
    }

    public void verCurso() {
        System.out.println("El curso es: " + curso);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("no de Cuenta: " + noCuenta);
        System.out.println("Curso: " + curso);
        System.out.println("calificación: " + calificacion);
    }

    @Override
    public void mostrarCurso() {

    }

    @Override
    public Void mostrarGRado() {
        return null;
    }

    @Override
    public void etrarCurso() {

    }
}