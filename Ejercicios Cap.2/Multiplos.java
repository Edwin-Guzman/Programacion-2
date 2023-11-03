import java.util.Scanner;

public class Multiplos{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        int numero2 = scanner.nextInt();

        if (numero2 != 0) {
            if (numero1 % numero2 == 0) {
                System.out.printf("%d es multiplo de %d.%n", numero1, numero2);
            } else {
                System.out.printf("%d no es multiplo de %d.%n", numero1, numero2);
            }
        } else {
            System.out.println("No se puede determinar, el segundo numero es 0.");
        }
        scanner.close();
    }
}