public class Motocicleta extends Vehiculo {

    int cilindrada;
    boolean tieneFrenosABS;

    public Motocicleta(String marca, int cantidadRuedas, int cilindrada, boolean tieneFrenosABS){
        super(marca, cantidadRuedas, 0, 0);
        this.cilindrada = cilindrada;
        this.tieneFrenosABS = tieneFrenosABS;
    }

    void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Tiene frenos ABS: " + tieneFrenosABS);
    }

    @Override
    public String toString(){
        return "Motocicleta - Marca: " + marca + ", Cilindrada: " + cilindrada + ", Tiene frenos ABS; " + tieneFrenosABS;
    }
}
