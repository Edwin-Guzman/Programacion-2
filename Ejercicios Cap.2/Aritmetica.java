import java.util.Scanner;

public class Aritmetica {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double numero1=scanner.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double numero2 = scanner.nextDouble();

        double suma = numero1+numero2;
        double producto = numero1*numero2;
        double diferencia = numero1-numero2;
        
        double cociente=0;
        if(numero2 !=0){
            cociente =numero1/numero2;
        }else{
            System.out.println("No se puede calcular el cociente, el segundo numero es 0.");
        }

        // Imprime los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + producto);
        System.out.println("Diferencia: " + diferencia);
        System.out.println("Cociente: " + cociente);

        scanner.close();
    }
}