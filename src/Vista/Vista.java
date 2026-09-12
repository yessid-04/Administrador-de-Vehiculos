package Vista;
import java.util.Scanner;



public class Vista {
    private Scanner scanner;

    public Vista() {
        this.scanner = new Scanner(System.in);
        System.out.println(" "); 
    }
    
    public void mostrarMenu() {
        System.out.println("\n---Gestionar viajes---");
        System.out.println("1. Agregar Vehiculo");
        System.out.println("2. Agregar Conductor ");
        System.out.println("3. Crear Viaje");
        System.out.println("3. Ver todos los viajes");
        System.out.println("4. Salir");
        System.out.print("Opción: ");
    }

    public int leerOpcion() {
        return scanner.nextInt();
    }

    public String leerNombre() {
        scanner.nextLine(); // limpiar buffer
    return scanner.nextLine();
    }

    public int leerID() {
        System.out.print("ID: ");
        return Integer.parseInt(scanner.nextLine().trim());
    }

    
}
