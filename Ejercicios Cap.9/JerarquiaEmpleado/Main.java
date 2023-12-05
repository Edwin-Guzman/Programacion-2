public class Main {
    public static void main(String[] args){

        //Empleado
        Empleado empleado = new Empleado("Edwin", "Guzman", "987-65-4321");

        System.out.println("Informacion del empleado:");
        System.out.println(empleado);

        //Empleado por comision
        EmpleadoPorComision empleadoPorComision= new EmpleadoPorComision("Juan", "Perez", "123-45-6789", 1000.0, 0.1);

        System.out.println("\nInformacion del empleado por comision:");
        System.out.println(empleadoPorComision);

        //Ingresos del empleado por comision
        System.out.printf("Ingresos: %.2f%n", empleadoPorComision.ingresos());

        //Empleado por hora
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Jose", "Perez", "345-81-6383", 100.0, 0.1);

        System.out.println("\nInformacion del empleado por hora:");
        System.out.println(empleadoPorHoras);

    }   
}
