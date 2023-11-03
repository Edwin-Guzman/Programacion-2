package Estacionamiento;
//import Estacionamiento.Calcularcargos;

import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Ingrese el numero de clientes estacionados ayer: ");
        int numClientes=scanner.nextInt();

        double totalRecibos =0;

        for (int i=1; i<=numClientes; i++) {
            System.out.print("Ingrese las horas de estacionamiento para el cliente " + i + ": ");
            int horasEstacionamiento=scanner.nextInt();

            double cargo = Calcularcargos.calcularCargos(horasEstacionamiento);
            totalRecibos += 3;

            System.out.println("El cargo para el cliente " + i + " es: lps" + cargo);
        }

        System.out.println("Total de recibos de ayer: Lps" + totalRecibos);

        scanner.close();
    }
}