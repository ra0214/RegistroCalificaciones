import java.util.ArrayList;
import java.util.Scanner;
import Models.*;

public class Main {
    private static Scanner teclado = new Scanner(System.in);
    private static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    private static ArrayList<Calificacion> Calificaciones1 = new ArrayList<>();
    private static ArrayList<Calificacion> Calificaciones2 = new ArrayList<>();
    private static ArrayList<Calificacion> Calificaciones3 = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("¿Quiere ingresar como alumno o Maestro?");
            System.out.println("1. Profesor");
            System.out.println("2. Alumno");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    int choose;
                    do {
                        System.out.println("1. Dar de alta al alumno");
                        System.out.println("2. Agregar calificaciones");
                        System.out.println("3. Ver todos los alumnos ingresados");
                        System.out.println("4. Salir");
                        System.out.print("Opcion: ");
                        choose = teclado.nextInt();

                        switch (choose) {
                            case 1:
                                addEstudiante();
                                break;
                            case 2:
                                addCalificaciones();
                                break;
                            case 3:
                                verAlumnos();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Ingrese una opción valida");
                                break;
                        }
                    } while (choose != 4);
                    break;
                case 2:
                    int escogerCorte;
                    do {
                        System.out.println("1. Ver calificacion del primer corte");
                        System.out.println("2. Ver calificacion del segundo corte");
                        System.out.println("3. Ver calificacion del tercer corte");
                        System.out.println("4. Ver promedio");
                        System.out.println("5. salir");
                        System.out.print("Opcion: ");
                        escogerCorte = teclado.nextInt();

                        switch (escogerCorte) {
                            case 1:
                            case 2:
                            case 3:
                                verCalificaciones(escogerCorte);
                                break;
                            case 4:
                                verPromedio();
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Ingrese una opción valida");
                                break;
                        }
                    } while (escogerCorte != 5);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
                    break;
            }
        } while (opcion != 3);
    }

    public static void addEstudiante() {
        int Matricula;
        String Nombre;
        String Apellido;
        System.out.println("Ingrese la Matricula:");
        Matricula = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese los nombres del alumno: ");
        Nombre = teclado.nextLine();
        System.out.println("Ingrese los apellidos del alumno: ");
        Apellido = teclado.nextLine();

        Estudiante estudiante = new Estudiante(Matricula, Nombre, Apellido);
        listaEstudiantes.add(estudiante);

        System.out.println("Se agrego exitosamente.");
    }

    public static void addCalificaciones() {
        int matricula;
        System.out.println("Ingrese la matricula del alumno: ");
        matricula = teclado.nextInt();

        Estudiante estudiante = getEstudianteByMatricula(matricula);
        if (estudiante == null) {
            System.out.println("No se encontro al estudiante con esa matricula.");
            return;
        }

        Calificacion calificacion = new Calificacion();

        System.out.println("Ingrese la calificacion del primer corte: ");
        float calificacion1 = teclado.nextFloat();
        calificacion.setCalificacion1(calificacion1);
        Calificaciones1.add(calificacion);

        System.out.println("Ingrese la calificacion del segundo corte: ");
        float calificacion2 = teclado.nextFloat();
        calificacion.setCalificacion2(calificacion2);
        Calificaciones2.add(calificacion);

        System.out.println("Ingrese la calificacion del tercer corte: ");
        float calificacion3 = teclado.nextFloat();
        calificacion.setCalificacion3(calificacion3);
        Calificaciones3.add(calificacion);

        System.out.println("Calificaciones agregadas exitosamente.");
    }

    public static void verAlumnos() {
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println(estudiante);
        }
    }

    public static void verCalificaciones(int corte) {
        ArrayList<Calificacion> Calificaciones;

        switch (corte) {
            case 1:
                Calificaciones = Calificaciones1;
                break;
            case 2:
                Calificaciones = Calificaciones2;
                break;
            case 3:
                Calificaciones = Calificaciones3;
                break;
            default:
                System.out.println("Corte no válido.");
                return;
        }

        for (Calificacion calificacion : Calificaciones) {
            switch (corte) {
                case 1:
                    System.out.println("Calificacion del primer corte: " + calificacion.getCalificacion1());
                    break;
                case 2:
                    System.out.println("Calificacion del segundo corte: " + calificacion.getCalificacion2());
                    break;
                case 3:
                    System.out.println("Calificacion del tercer corte: " + calificacion.getCalificacion3());
                    break;
            }
        }
    }

    public static void verPromedio() {
        float suma = 0;
        int count = 0;

        for (Calificacion calificacion1 : Calificaciones1) {
            suma += calificacion1.promedio();
            count++;
        }

        for (Calificacion calificacion2 : Calificaciones2) {
            suma += calificacion2.promedio();
            count++;
        }

        for (Calificacion calificacion3 : Calificaciones3) {
            suma += calificacion3.promedio();
            count++;
        }

        if (count > 0) {
            float promedio = suma / count;
            System.out.println("Promedio de calificaciones: " + promedio);
        } else {
            System.out.println("No hay calificaciones para hacer el calculo.");
        }
    }

    public static Estudiante getEstudianteByMatricula(int matricula) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getMatricula() == matricula) {
                return estudiante;
            }
        }
        return null;
    }
}
