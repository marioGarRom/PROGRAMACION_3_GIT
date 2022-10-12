package EXAMEN;
public abstract class Empleado {
    //(Atributos)

    private String RFC ;
    private String apellidos;
    private String nombres;

    //(Constructores)

    public Empleado ( ) { }
    public Empleado (String RFC, String apellidos, String nombres){
        this.RFC=RFC;
        this.apellidos=apellidos;
        this.nombres=nombres;
    }

    //Encapsulamiento

    public String getRFC()
    {return RFC; }
    public void setRFC (String RFC)
    {this.RFC = RFC; }
    public String getApellidos ()
    {return apellidos; }
    public void setApellidos (String apellidos)
    {this.apellidos=apellidos; }
    public String getNombres ()
    {return nombres; }
    public void setNombres (String nombres)
    {this.nombres = nombres; }

    public abstract double ingresos ();
    public abstract double bonificaciones ();
    public abstract double descuentos ();

}
