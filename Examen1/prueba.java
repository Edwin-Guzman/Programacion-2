import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto");
        String produc=scanner.nextLine();
        System.out.println("Ingrese la cantidad");
        float canti=scanner.nextFloat();
        System.out.println("Ingrese el precio unitario del producto");
        float precio_u=scanner.nextFloat();

        Linea_Factura sub=new Linea_Factura(canti, precio_u);

        scanner.close();
    }
}
