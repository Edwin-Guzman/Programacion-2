package Ahorros;
import Ahorros.CuentaDeAhorros;

public  class PruebaCuentaDeAhorros {
    public static void main(String[] args) {
        CuentaDeAhorros.modificarTasaInteres(4.0); // Establece la tasa de interes al 4%

        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(2000.0);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(3000.0);

        for (int mes = 1; mes <= 12; mes++) {
            ahorrador1.calcularInteresMensual();
            ahorrador2.calcularInteresMensual();

            System.out.println("Mes " + mes);
            System.out.println("Saldo Ahorrador 1: " + ahorrador1.obtenerSaldoAhorros());
            System.out.println("Saldo Ahorrador 2: " + ahorrador2.obtenerSaldoAhorros());
        }

        CuentaDeAhorros.modificarTasaInteres(5.0); // Cambia la tasa de interes al 5%

        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();

        System.out.println("Mes 13");
        System.out.println("Saldo Ahorrador 1: " + ahorrador1.obtenerSaldoAhorros());
        System.out.println("Saldo Ahorrador 2: " + ahorrador2.obtenerSaldoAhorros());
    }
} 

