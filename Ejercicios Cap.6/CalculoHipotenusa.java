public class CalculoHipotenusa{
    public static void main(String[] args) {
        
        double lado1, lado2;

        //Triangulo1
        lado1=3.0;
        lado2=4.0;
        System.out.printf("Triangulo 1 - Hipotenusa: %.2f%n", hipotenusa(lado1,lado2)); 

        //Triangulo2
        lado1=5.0;
        lado2=12.0;
        System.out.printf("Triangulo 2 - Hipotenusa: %.2f%n", hipotenusa(lado1,lado2)); 

        //Triangulo3
        lado1=8.0;
        lado2=12.0;
        System.out.printf("Triangulo 1 - Hipotenusa: %.2f%n", hipotenusa(lado1,lado2)); 
    }
    public static double hipotenusa(double lado1, double lado2){
        return Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2,2));
    }
}
