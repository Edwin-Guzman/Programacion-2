import java.util.Scanner;

public class EquivalenteBinario {
    public static void main(String[] args){
 
        Scanner scanner=new Scanner(System.in);

        System.out.print("Ingrese un numero binario (solo digitos 0 y 1): ");

        String binariostr= scanner.nextLine();
        int longitud= binariostr.length();
        int decimal=0;

        for(int i=0; i<longitud; i++){
            char digito= binariostr.charAt(i);
            int valorDigito= Character.getNumericValue(digito);

            if(valorDigito==0 || valorDigito==1){
                decimal+=  valorDigito*Math.pow(2, longitud - 1 - i);   
            }else{
                System.out.println("Numero binario no valido.");
                return;
            }
        }
        
        System.out.println("El equivalente decimal es: " + decimal);

        scanner.close();
    }
}
