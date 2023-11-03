import java.util.Scanner;

public class CalculadoraCirculo {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.print("Ingrese el radio de la circuferencia (entero): ");

        int radio= scanner.nextInt();
        double diametro = 2*radio;
        double circunferencia =2*Math.PI*radio;
        double area= Math.PI*radio*radio;
        
        System.out.printf("Diametro: %.2f%n", diametro);
        System.out.printf("Circunferencia: %.2f%n", circunferencia);
        System.out.printf("Area: %.2f%n", area);

        scanner.close(); 
    }   
}
