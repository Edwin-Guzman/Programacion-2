import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] memoria = new int[100];
        int acumulador = 0;
        int contadorDeInstrucciones = 0;
        int codigoDeOperacion, operando;

        System.out.println("* Bienvenido a Simpletron! *");
        System.out.println("* Por favor, introduzca en su programa una instrucción *");
        System.out.println("* (o palabra de datos) a la vez. Yo le mostraré *");
        System.out.println("* el número de ubicación y un signo de interrogación (?) *");
        System.out.println("* Entonces usted escribirá la palabra para esa ubicación. *");
        System.out.println("* Teclee -9999 para dejar de introducir su programa. *");

        // Entrada de programa
        while (true) {
            System.out.printf("%02d ? ", contadorDeInstrucciones);
            int instruccion = scanner.nextInt();

            if (instruccion == -9999) {
                System.out.println("* Se completó la carga del programa *");
                System.out.println("* Comienza la ejecución del programa *");
                break;
            }

            memoria[contadorDeInstrucciones] = instruccion;
            contadorDeInstrucciones++;
        }

        contadorDeInstrucciones = 0;

        // Ejecución del programa
        while (true) {
            int instruccion = memoria[contadorDeInstrucciones];
            codigoDeOperacion = instruccion / 100;
            operando = instruccion % 100;

            switch (codigoDeOperacion) {
                case 10:  // Leer
                    System.out.print("Ingrese un valor: ");
                    int valor = scanner.nextInt();
                    memoria[operando] = valor;
                    break;
                case 11:  // Escribir
                    System.out.println("Salida: " + memoria[operando]);
                    break;
                case 20:  // Cargar
                    acumulador = memoria[operando];
                    break;
                case 21:  // Almacenar
                    memoria[operando] = acumulador;
                    break;
                case 30:  // Sumar
                    acumulador += memoria[operando];
                    break;
                case 31:  // Restar
                    acumulador -= memoria[operando];
                    break;
                case 32:  // Divide
                    if (memoria[operando] != 0) {
                        acumulador /= memoria[operando];
                    } else {
                        System.out.println("Error: División por cero.");
                        return;
                    }
                    break;
                case 33:  // Multiplica
                    acumulador *= memoria[operando];
                    break;
                case 40:  // Bifurca
                    contadorDeInstrucciones = operando;
                    break;
                case 41:  // BifurcaNeg
                    if (acumulador < 0) {
                        contadorDeInstrucciones = operando;
                    }
                    break;
                case 42:  // BifurcaCero
                    if (acumulador == 0) {
                        contadorDeInstrucciones = operando;
                    }
                    break;
                case 43:  // Detener
                    System.out.println("* Fin de la ejecución *");
                    System.out.println("Contenido del acumulador: " + acumulador);
                    System.out.println("Estado final de la memoria:");
                    for (int i = 0; i < 100; i++) {
                        System.out.printf("%02d: %04d\n", i, memoria[i]);
                    }
                    return;
                default:
                    System.out.println("Código de operación no válido.");
                    break;
            }

            contadorDeInstrucciones++;
        }
    }
}