package Ahorros;

public class CuentaDeAhorros {
    private static double tasaInteresAnual;
    private double saldoAhorros;

    public CuentaDeAhorros(double saldoInicial) {
        saldoAhorros = saldoInicial;
    }

    public void calcularInteresMensual() {
        double interesMensual = (saldoAhorros * (tasaInteresAnual / 12)) / 100.0;
        saldoAhorros += interesMensual;
    }

    public static void modificarTasaInteres(double nuevaTasa) {
        tasaInteresAnual = nuevaTasa;
    }

    public double obtenerSaldoAhorros() {
        return saldoAhorros;
    }
}
