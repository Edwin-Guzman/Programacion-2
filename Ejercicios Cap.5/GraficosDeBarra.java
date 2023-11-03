import java.util.Scanner;

public class GraficosDeBarra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese un numero entre 1 y 30: ");
            int numero = scanner.nextInt();

            if (numero >= 1 && numero <= 30) {
                for (int j = 1; j <= numero; j++) {
                    System.out.print("*");
                }
                System.out.println(); 
            } else {
                System.out.println("Numero no valido. Debe estar entre 1 y 30.");
                i--;
            }
        }
        scanner.close();
    }
}