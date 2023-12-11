public class Prueba {

    public static void main(String[] args) {
        
        Motocicleta moto1 = new Motocicleta("Honda", 2, 250, true);
        Motocicleta moto2 = new Motocicleta("Yamaha", 2, 150, false);
        Turismo turismo1 = new Turismo("Toyota", 4, 5, "Gasolina");
        Turismo turismo2 = new Turismo("Ford", 4, 7, "Diesel");
        Motocicleta moto3 = new Motocicleta("Suzuki", 2, 200, true);

        Conductor motorista1 = new Conductor("Edwin");
        Conductor motorista2 = new Conductor("Andrea");

        motorista1.asignarVehiculo(moto1);
        motorista2.asignarVehiculo(turismo1);

        motorista1.mostrarInfo();
        motorista2.mostrarInfo();

        System.out.println("Marcas de las motocicletas:");
        moto1.mostrarInfo();
        moto2.mostrarInfo();
        moto3.mostrarInfo();

        System.out.println("Marcas de los turismos:");
        turismo1.mostrarInfo();
        turismo2.mostrarInfo();

        System.out.println("Cantidad de ruedas de las motocicletas");
        System.out.println("Moto 1: " + moto1.cantidadRuedas);
        System.out.println("Moto 2: " + moto2.cantidadRuedas);
        System.out.println("Moto 3: " + moto3.cantidadRuedas );

        System.out.println("Cantidad de ruedas de los turismos:");
        System.out.println("Turismo 1: " + turismo1.cantidadRuedas);
        System.out.println("Turismo 2: "+ turismo2.cantidadRuedas);

  
    }
}
