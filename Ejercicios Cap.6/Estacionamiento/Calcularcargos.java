package Estacionamiento;

public class Calcularcargos {

    public static double calcularCargos(int horasEstacionamiento) {
        double cargo;

        if(horasEstacionamiento <= 3) {
            cargo=2.00;
        }else{
            cargo=2.00+0.50*(horasEstacionamiento - 3);

            if(cargo>10.00) {
                cargo=10.00;
            }
        }
        return cargo;
    }
}