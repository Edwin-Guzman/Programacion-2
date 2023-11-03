import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener información de los empleados
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el nombre del empleado " + (i+1) + ":");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el número de horas trabajadas por el empleado " + (i+1) + ":");
            int horasTrabajadas = scanner.nextInt();

            System.out.println("Ingrese la tarifa por hora del empleado " + (i+1) + ":");
            double tarifaHora = scanner.nextDouble();

            // Calcular el sueldo bruto
            double sueldoBruto = calcularSueldoBruto(horasTrabajadas, tarifaHora);

            // Mostrar el resultado
            System.out.println("El sueldo bruto de " + nombre + " es: Lps" + sueldoBruto);

            scanner.nextLine(); // Limpiar el buffer de entrada
        }

        // Cerrar el scanner
        scanner.close();
    }

    public static double calcularSueldoBruto(int horasTrabajadas, double tarifaHora) {
        double sueldoBruto = 0;

        if (horasTrabajadas <= 40) {
            sueldoBruto = horasTrabajadas * tarifaHora;
        } else {
            double horasNormales = 40 * tarifaHora;
            double horasExtras = (horasTrabajadas - 40) * (tarifaHora * 1.5);
            sueldoBruto = horasNormales + horasExtras;
        }

        return sueldoBruto;
    }
}