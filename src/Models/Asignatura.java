package Models;

import java.util.ArrayList;
public class Asignatura {
    private String nombre;
    private ArrayList<Estudiante> student = new java.util.ArrayList<>();

    public boolean addEstudiante(Estudiante estudiantes){
        boolean status;
        status =student.add(estudiantes);
        return status;
    }

    public ArrayList<Estudiante> getEstudiantes(){
        return student;
    }
}