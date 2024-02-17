package Models;

public class Estudiante {
    private int matricula;
    private String nombre;
    private String apellido;

    public Estudiante(int matricula, String nombre, String apellido) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString(){
        return "Estudiante{ " +
                "Matricula: " + matricula +
                "Nombre : " + nombre + '\'' +
                "Apellido: " + apellido + '\'' +
                '}';
    }
}