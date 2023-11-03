public class ModificadoInteresCompuesto {
    public static void main(String[] args) {
        double monto;
        double principal = 1000.0;
        
        // Muestra los encabezados
        System.out.printf("%s%15s%20s%n", "Ano", "Tasa de Interes", "Monto en Deposito");
        
        for (double tasa = 0.05; tasa <= 0.10; tasa += 0.01) {
            System.out.printf("Tasa: %.2f%n", tasa * 100); // Muestra la tasa de interes en porcentaje

            for (int anio = 1; anio <= 10; ++anio) {
                // Calcula el nuevo monto para el año especificado
                monto = principal * Math.pow(1.0 + tasa, anio);

                // Muestra el año, la tasa y el monto
                System.out.printf("%4d%15.2f%,20.2f%n", anio, tasa, monto);
            }
            System.out.println();
        }
    }
}