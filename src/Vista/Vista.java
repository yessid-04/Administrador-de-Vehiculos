package Vista;
import java.util.Scanner;

public class Vista {
    private final Scanner scanner;
    //inicializaicon
    public Vista() {
        this.scanner = new Scanner(System.in);
        System.out.println(" "); 
    }
    //Menu principal
    public void mostrarMenu() {
        System.out.println("\n---Gestor de Vehiculos---");
        System.out.println("1. Registrar nuevo vehículo");
        System.out.println("2. Registrar nuevo conductor ");
        System.out.println("3. Mostrar listado de vehículos existentes");
        System.out.println("4. Mostrar listado de conductores existentes");
        System.out.println("5. Salir");
    }
    public int leerOpccion() {
        int opccion = scanner.nextInt();
        scanner.nextLine();
        return opccion;
    }
    //////////////////////////////////////////////////////////////////
    public String leerID() {
        System.out.print("ID del vehiculo: ");
        return scanner.nextLine();
    }
    public String leerModelo() {
        System.out.print("Modelo del vehiculo: ");
        return scanner.nextLine();
    }
     public String leerPlaca() {
        System.out.print("Placa del vehiculo: ");
        return scanner.nextLine();
    }
    public int leerNitDeConductor() {
        System.out.print("Digite el NIT del conductor para este vehículo: ");
        int nit = scanner.nextInt();
        scanner.nextLine();
        return nit;
    }
    public double leerCantidadDeKilometros() {
        System.out.print("Ingrese la cantidad de kilometors que recorre el vehiculo: ");
        double km = scanner.nextDouble();
        scanner.nextLine();
        return km;
    }
    /////////////////////////////////////////////////////////////////
    public String leerNombreConductor() {
        System.out.print("Nombre del nuevo conductor: ");
        return scanner.nextLine();
    }
    public int leerNitConductor() {
        System.out.print("NIT del nuevo conductor: ");
        int nit = scanner.nextInt();
        scanner.nextLine();
        return nit;
    }
    
    
}
