public class EmpleadoPorHoras extends Empleado {
    private double horas; // horas trabajadas
    private double sueldo; // sueldo por horas

    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double sueldo, double horas) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        establecerSueldo(sueldo);
        establecerHoras(horas);
    }

    public void establecerSueldo(double sueldo) {
        if (sueldo >= 0) {
            this.sueldo = sueldo;
        } else {
            throw new IllegalArgumentException("El sueldo debe ser mayor o igual a 0");
        }
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerHoras(double horas) {
        if (horas >= 0 && horas <= 168) {
            this.horas = horas;
        } else {
            throw new IllegalArgumentException("Las horas deben estar entre 0 y 168");
        }
    }

    public double obtenerHoras() {
        return horas;
    }

    

    @Override
    public double ingresos() {
        if (obtenerHoras() <= 40) {
            return obtenerHoras() * obtenerSueldo();
        } else {
            return 40 * obtenerSueldo() + (obtenerHoras() - 40) * obtenerSueldo() * 1.5;
        }
    }

    @Override
    public String toString() {
        return String.format("%s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                super.toString(), "sueldo por horas", obtenerSueldo(), "horas trabajadas", obtenerHoras(),
                "ingresos", ingresos());
    }
}