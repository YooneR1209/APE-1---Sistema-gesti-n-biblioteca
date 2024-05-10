package individuo;

public abstract class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private int dni;
    private int numeroCelular;
    private String direccion;
    //Relaciones
    private Lector estudiante;
    private Autor autor;
    private Bibliotecario bibliotecaria;
}
