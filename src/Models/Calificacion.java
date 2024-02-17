package Models;

public class Calificacion {

    private float calificacion1;
    private float calificacion2;
    private float calificacion3;

    public float promedio() {
        return (calificacion1 + calificacion2 + calificacion3) / 3;
    }
    /*public float getCalificacion1() {
        return Calificacion1;
    }*/

    public void setCalificacion1(float calificacion1) {
        this.calificacion1 = calificacion1;
    }

    /*public float getCalificacion2() {
        return Calificacion2;
    }*/

    public void setCalificacion2(float calificacion2) {
        this.calificacion2 = calificacion2;
    }

    /*public float getCalificacion3() {
        return Calificacion3;
    }*/

    public void setCalificacion3(float calificacion3) {
        this.   calificacion3 = calificacion3;
    }

    @Override
    public String toString() {
        return "Calificacion{" +
                "Calificacion1=" + calificacion1 +
                ", Calificacion2=" + calificacion2 +
                ", Calificacion3=" + calificacion3 +
                ", promedio=" + promedio() +
                '}';
    }
}
