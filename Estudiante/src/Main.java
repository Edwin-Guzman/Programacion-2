public class Main {
    public static void main(String[] args) {
        ESTUDIANTE estudiante = new ESTUDIANTE(12345, "Juan");
        estudiante.matricular("Matemáticas");
        estudiante.setCalificacion(85);
        System.out.println(estudiante.getObservacion());
    }
}





