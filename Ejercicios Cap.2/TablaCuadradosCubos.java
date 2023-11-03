public class TablaCuadradosCubos {
    public static void main(String[] Args){
        System.out.println("Numero Cuadrado Cubo");

        for (int numero=0; numero<=10; numero++){
            int cuadrado = numero*numero;
            int cubo = numero*numero*numero;

            System.out.printf("%-6d %-8d %-6dn", numero, cuadrado, cubo);
        }
    }
}
