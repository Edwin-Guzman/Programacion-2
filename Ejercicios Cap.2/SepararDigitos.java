import java.util.Scanner;

public class SepararDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero de cinco digitos: ");
        int numero = scanner.nextInt();

        // Asegurar que el numero tiene cinco digitos
        if (numero >= 10000 && numero <= 99999) {
            int digito1 = numero / 10000;
            int digito2 = (numero / 1000) % 10;
            int digito3 = (numero / 100) % 10;
            int digito4 = (numero / 10) % 10;
            int digito5 = numero % 10;

            System.out.printf("%d   %d   %d   %d   %d%n", digito1, digito2, digito3, digito4, digito5);
        } else {
            System.out.println("El numero ingresado no tiene cinco digitos.");
        }

        scanner.close();
    }
}