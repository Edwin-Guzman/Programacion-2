class Vehiculo {

    String marca;
    int cantidadRuedas;
    int anioFabricacion;
    double precio;

    public Vehiculo(String marca, int cantidadRuedas, int anioFabricacion, double precio){

        this.marca = marca;
        this.cantidadRuedas = cantidadRuedas;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
    }

    void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Cantidad de ruedas: " + cantidadRuedas);
        System.out.println("Anio de fabricacion: " + anioFabricacion);
        System.out.println("Precio" + precio);
    }
}