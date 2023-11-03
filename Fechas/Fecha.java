    import java.time.LocalDate;
    import java.time.temporal.ChronoUnit;
    import java.util.Scanner;

    public class Fecha {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Ingrese la primera fecha (yyyy-mm-dd):");
            LocalDate fecha1 = LocalDate.parse(scanner.nextLine());
            
            System.out.println("Ingrese la segunda fecha (formato: yyyy-mm-dd):");
            LocalDate fecha2 = LocalDate.parse(scanner.nextLine());
            
            if (fecha1.getYear() < 2000 || fecha2.getYear() < 2000) {
                System.out.println(" El ano debe ser minimo 2000.");
            } else {
                long diasEntreFechas = ChronoUnit.DAYS.between(fecha1, fecha2);
                System.out.println("Dias entre las dos fechas: " + diasEntreFechas);
            }
            
            scanner.close();
        }
    }
    