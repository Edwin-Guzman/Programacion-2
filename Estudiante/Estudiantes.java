package Estudiante;

public class Estudiantes {
    private int cuenta;
    private String nombre;
    private String materia;
    private int calificacion;

    public Estudiantes(int cuenta, String nombre) {
        this.cuenta = cuenta;
        this.nombre = nombre;
    }

    public Estudiantes(int cuenta, String nombre, String materia, int calificacion) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    public void matricular(String materia) {
        this.materia = materia;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getCuenta() {
        return cuenta;
    }

    public String getObservacion() {
        if (calificacion >= 65) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Materia: " + materia);
    }
}