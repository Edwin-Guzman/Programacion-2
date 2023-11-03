public class NumerosPrimos {
    public static void main(String[] args) {
        int limite = 10000;

        System.out.println("Numeros primos menores que 10,000:");

        for (int numero = 2; numero < limite; numero++) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }
    }

    // Método para determinar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}