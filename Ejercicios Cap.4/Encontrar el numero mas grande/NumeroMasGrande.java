import java.util.Scanner;

public class NumeroMasGrande {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        int contador = 0;
        int numero;
        int mayor = Integer.MIN_VALUE;
        
        while (contador < 10) {
            System.out.print("Ingrese un numero: ");
            numero = Scanner.nextInt();
            
            if (numero > mayor) {
                mayor = numero;
            }
            
            contador++;
        }
        
        System.out.println("El numero mas grande es: " + mayor);
        
        Scanner.close();
    }
}