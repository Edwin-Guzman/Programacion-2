import java.util.Scanner;

public class Exponenciacion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Ingrese la base (entero): ");
        int base =scanner.nextInt();

        System.out.print("Ingrese el exponete (entero positivo diferente de 0): ");
        int exponente= scanner.nextInt();

        if(exponente>0){
            int resultado= enteroPotencia(base, exponente);
            System.out.printf("%d^%d = %d%n", base, exponente, resultado);
        }else{
            System.out.println("El exponente debe ser un entero positivo diferente a 0.");
        }
        scanner.close();
    }

    public static int enteroPotencia(int base, int exponente){
        int resultado=1;

        for(int i=1; i<=exponente; i++){
            resultado*=base;
        }
        return resultado;
    }
}
