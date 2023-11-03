import java.util.Scanner;

public class ParImpar{
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entero: ");
        int numero = scanner.nextInt();

        if (esPar(numero)){
            System.out.println(numero + " es un numero par.");
        }
        else{
            System.out.println(numero + " es un numero impar.");
        }
        scanner.close();
    }
    public static boolean esPar(int numero){
            return numero%2 == 0;
    }
}
