package Palindromo;
import java.util.Scanner;

public class Verificador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number;
        boolean isValid = false;
        
        do {
            System.out.print("Ingrese un número de cinco dígitos: ");
            number = scanner.nextInt();
            
            // Verificar si el número tiene cinco dígitos
            if (number < 10000 || number > 99999) {
                System.out.println("Error: el número ingresado no tiene cinco dígitos.");
            } else {
                isValid = true;
            }
        } while (!isValid);
        
        // Convertir el número a una cadena de caracteres
        String numberString = String.valueOf(number);
        
        // Verificar si es un palíndromo
        boolean isPalindrome = true;
        int length = numberString.length();
        for (int i = 0; i < length / 2; i++) {
            if (numberString.charAt(i) != numberString.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        // Mostrar el resultado
        if (isPalindrome) {
            System.out.println("El número " + number + " es un palíndromo.");
        } else {
            System.out.println("El número " + number + " no es un palíndromo.");
        }
        
        scanner.close();
    }
}