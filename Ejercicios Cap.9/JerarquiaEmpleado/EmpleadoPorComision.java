public class EmpleadoPorComision extends Empleado{
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        if(ventasBrutas < 0.0)
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");

        if(tarifaComision <= 0.0 || tarifaComision >= 1.0)
            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0");

        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public void establecerVentasBrutas(double ventasBrutas){
        if(ventasBrutas < 0.0)
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");

        this.ventasBrutas = ventasBrutas;
    }

    public double obtenerVentasBrutas(){
        return ventasBrutas;
    }

    public void establecerTarifaComision(double tarifaComision){
        if(tarifaComision <= 0.0 || tarifaComision >= 1.0)
            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0");

        this.tarifaComision = tarifaComision;
    }

    public double obtenerTarifaComision(){
        return tarifaComision;
    }

    public double ingresos(){
        return obtenerTarifaComision()*obtenerVentasBrutas();
    }

    @Override
    public String toString(){
        return String.format("%s%n%s: %.2f%n%s: %.2f", super.toString(), "ventas brutas", obtenerVentasBrutas(), "tarifa de comision", obtenerTarifaComision());
    }
}