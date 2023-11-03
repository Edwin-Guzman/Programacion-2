import java.util.Scanner;

public class ConvertirFaCyCaF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Elija una opcion:");
            System.out.println("1. Convertir de Fahrenheit a Centigrados");
            System.out.println("2. Convertir de Centigrados a Fahrenheit");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
                    double fahrenheit = scanner.nextDouble();
                    double centigrados = convertirAFahrenheit(fahrenheit);
                    System.out.printf("%.2f grados Fahrenheit equivalen a %.2f grados Centigrados%n", fahrenheit, centigrados);
                    break;
                case 2:
                    System.out.print("Ingrese la temperatura en grados Centigrados: ");
                    double centigrados2 = scanner.nextDouble();
                    double fahrenheit2 = convertirACentigrados(centigrados2);
                    System.out.printf("%.2f grados Centigrados equivalen a %.2f grados Fahrenheit%n", centigrados2, fahrenheit2);
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }

    // Método para convertir de Fahrenheit a Centígrados
    public static double convertirACentigrados(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    // Método para convertir de Centígrados a Fahrenheit
    public static double convertirAFahrenheit(double centigrados) {
        return 9.0 / 5.0 * centigrados + 32;
    }
}