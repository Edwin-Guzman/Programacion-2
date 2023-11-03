import java.text.SimpleDateFormat;
import java.util.Date;

public class Boleto {

    private String evento;
    private String fecha;
    private String ubicacion;
    private double precio;

    public Boleto(String evento, String fecha, String ubicacion, double precio) {
        this.evento = evento;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.precio = precio;
    }

    public void generarBoleto() {
        System.out.println("--------------- BOLETO ---------------");
        System.out.println("Evento: " + evento);
        System.out.println("Fecha: " + fecha);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Precio: Lps." + precio);
        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {
        // Obtener la fecha actual
        Date fechaActual = new Date();
        // Formato de fecha
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String fecha = formatoFecha.format(fechaActual);

        // Crear un boleto de ejemplo
        Boleto boleto = new Boleto("Partido De Futbol", fecha, "Estadio Nacional ", 100.0);

        boleto.generarBoleto();
    }
}