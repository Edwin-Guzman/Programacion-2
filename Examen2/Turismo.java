public class Turismo extends Vehiculo {

    int capacidadPasajeros;
    String tipoCombustible;

    public Turismo(String marca, int cantidadRuedas, int capacidadPasajeros, String tipoCombustible){
        super(marca, cantidadRuedas, 0, 0);
        this.capacidadPasajeros = capacidadPasajeros;
        this.tipoCombustible = tipoCombustible;
    }

    void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);
        System.out.println("Tipo de combustuble: " + tipoCombustible);
    }

    @Override
    public String toString(){
        return "Turismo - Marca: " + marca + ", Capacidad de pasajeros:" + capacidadPasajeros + ", Tipo de combsutible: " + tipoCombustible;
    }
}
