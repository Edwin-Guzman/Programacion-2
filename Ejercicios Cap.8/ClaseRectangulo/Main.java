
package ClaseRectangulo;

public class Main {
    public static void main(String[] args) {
        //Rectangulo con los valores predeterminados
        Rectangulo rectangulo1 = new Rectangulo();
        
        System.out.println("Rectangulo 1");
        System.out.println("Longitud: " + rectangulo1.getLongitud());
        System.out.println("Anchura: " + rectangulo1.getAnchura());
        System.out.println("Perimetro: " + rectangulo1.calcularPerimetro());
        System.out.println("Area: " + rectangulo1.calcularArea());
        
        // Modificar los valores del rectangulo1
        rectangulo1.setLongitud(5.0);
        rectangulo1.setAnchura(3.0);
        
        System.out.println("\nRectangulo 1 (despues de modificar los valores)");
        System.out.println("Longitud: " + rectangulo1.getLongitud());
        System.out.println("Anchura: " + rectangulo1.getAnchura());
        System.out.println("Perimetro: " + rectangulo1.calcularPerimetro());
        System.out.println("Area: " + rectangulo1.calcularArea());
        
        //Rectangulo con los valores personalizados
        Rectangulo rectangulo2 = new Rectangulo(8.0, 4.0);
        
        System.out.println("\nRectangulo 2");
        System.out.println("Longitud: " + rectangulo2.getLongitud());
        System.out.println("Anchura: " + rectangulo2.getAnchura());
        System.out.println("Perimetro: " + rectangulo2.calcularPerimetro());
        System.out.println("Area: " + rectangulo2.calcularArea());
    }
}