package Estudiante;

public class Prueba {
    public static void main(String[] args) {
        Estudiantes estudiante = new Estudiantes(12345, "Juan");
        estudiante.matricular("Matemáticas");
        estudiante.setCalificacion(85);
        System.out.println(estudiante.getObservacion());
    }
}