public class Linea_Factura {

    float Cantidad;
    String Producto;
    float Precio_unitario;

    public float [] LineaFacturas={Cantidad,Precio_unitario};
    public float[] obtenerarray(){
        return LineaFacturas;
    }

    public  Linea_Factura(float Cantidad,float Precio_unitario){

        this.Cantidad=Cantidad;
        this.Precio_unitario=Precio_unitario;
        float getSubTotal=Precio_unitario*Cantidad;
    } 
}
