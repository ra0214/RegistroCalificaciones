package Models;

import java.util.ArrayList;

public class Calificaciones {


    private ArrayList<Calificacion> calificaciones1 = new ArrayList<>();

    public boolean addCalificacion1(Calificacion calificacion){
        boolean status;
        status =calificaciones1.add(calificacion);
        return status;
    }

    private ArrayList<Calificacion> calificacion2 = new ArrayList<>();
    public boolean addCalificacion2(Calificacion calificacion){
        boolean status;
        status = calificacion2.add(calificacion);
        return status;
    }

    private ArrayList<Calificacion> calificacion3 = new ArrayList<>();
    public boolean addCalificacion3(Calificacion calificacion){
        boolean status;
        status = calificacion3.add(calificacion);
        return status;
    }

    public ArrayList<Calificacion> getCalificaciones1() {
        return calificaciones1;
    }

    public ArrayList<Calificacion> getCalificacion2() {
        return calificacion2;
    }

    public ArrayList<Calificacion> getCalificacion3() {
        return calificacion3;
    }
}
