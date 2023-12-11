public class Conductor {
    String nombre;
    Vehiculo vehiculoAsignado;

    public Conductor(String nombre){
        this.nombre = nombre;
    }

    void asignarVehiculo(Vehiculo vehiculo){
        this.vehiculoAsignado = vehiculo;
    }

    void mostrarInfo(){
        System.out.println("Nombre del conductor: " + nombre);
        System.out.println("Vehiculo asignado: " + vehiculoAsignado);
        vehiculoAsignado.mostrarInfo();
        System.out.println();
    }
    
}
