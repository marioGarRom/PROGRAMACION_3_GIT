public class Persona {
    protected String nombre, sexo, direccion;
    protected int edad;

    public Persona(String nombre, int edad, String sexo, String direccion) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.direccion = direccion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Direccion: " + direccion);
    }
}
