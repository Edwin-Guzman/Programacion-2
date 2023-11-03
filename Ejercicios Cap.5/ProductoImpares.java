public class ProductoImpares {
    public static void main(String[] args){

        int ProductoImpares=1;

        for(int i=1; i<=15; i+=2){
            ProductoImpares *=i;
        }

        System.out.println("El producto de los enteros impares del 1 al 15 es: "+ ProductoImpares);
    }
}
