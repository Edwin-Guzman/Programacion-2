import java.util.Scanner;

public class ComisionesVenta {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        double salarioBase= 200.0;
        double porcentajeComision= 0.09;

        System.out.print("Ingrese el numero de articulos vendidos por el vendedor: ");

        int numeroArticulos= scanner.nextInt();
        double totalVentas= 0.0;

        for(int i=1; i<= numeroArticulos; i++){

            System.out.print("Ingrese el valor del articulo" + i + ": Lps. ");
            double valorArticulo=scanner.nextDouble();
            totalVentas += valorArticulo;
        }

        double comision= totalVentas*porcentajeComision;
        double ingresosTotales= salarioBase*comision;

        System.out.println("El vendedor ha ganado un salario base de Lps. " + salarioBase);
        System.out.println("Total de ventas realizadas es de Lps. " + totalVentas);
        System.out.println("La comision ganaada es de Lps" + comision);
        System.out.println("Los ingresos totales del vendedor son Lps. " + ingresosTotales);

        scanner.close();
    }
}
