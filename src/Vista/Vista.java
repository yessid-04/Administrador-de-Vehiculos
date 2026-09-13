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
    public int leerOpcion() {
        try {
            int opccion = scanner.nextInt();
            scanner.nextLine();
            return opccion;
        } catch (Exception e) {
            scanner.nextLine(); // Limpia el error
            return -1;
        }
    }
    //////////////////////////////////////////////////////////////////
    public String leerID() {
        String id = "";
        while (id.isEmpty()) {
            System.out.print("ID del vehiculo: ");
            id = scanner.nextLine().trim();
            if (id.isEmpty()) {
                System.out.println("⚠️ El ID no puede estar vacío.");
            }
        }
        return id;
    }
    public String leerModelo() {
        String modelo = "";
        while (modelo.isEmpty()) {
            System.out.print("Modelo del vehiculo: ");
            modelo = scanner.nextLine().trim();
            if (modelo.isEmpty()) {
                System.out.println("⚠ El modelo no puede estar vacío.");
            }
        }
        return modelo;
    }
    public String leerPlaca() {
        String placa = "";
        while (placa.isEmpty()) {
            System.out.print("Placa del vehiculo: ");
            placa = scanner.nextLine().trim();
            if (placa.isEmpty()) {
                System.out.println(" La placa no puede estar vacía.");
            }
        }
        return placa;
    }
    public int SeleccionarNitDeConductor() {
        int nit = -1;
        while (nit <= 0) {
            System.out.print("Digite el NIT del conductor para este vehículo: ");
            try {
                nit = scanner.nextInt();
                scanner.nextLine();
                if (nit <= 0) System.out.println("El NIT debe ser un número positivo.");
            } catch (Exception e) {
                System.out.println("Error: Ingrese solo números para el NIT.");
                scanner.nextLine(); // Limpia error
            }
        }
        return nit;
    }
    public double leerCantidadDeKilometros() {
        double km = -1;
        while (km < 0) {
            System.out.print("Ingrese la cantidad de kilometors que recorre el vehiculo: ");
            try {
                km = scanner.nextDouble();
                scanner.nextLine();
                if (km < 0) {
                    System.out.println(" Los kilómetros no pueden ser negativos.");
                }
            } catch (Exception e) {
                System.out.println(" Error: Ingrese un número válido para los kilómetros.");
                scanner.nextLine(); // Limpia error
            }
        }
        return km;
    }
    /////////////////////////////////////////////////////////////////
    public String leerNombreConductor() {
        String nombre = "";
        while (nombre.isEmpty()) {
            System.out.print("Nombre del nuevo conductor: ");
            nombre = scanner.nextLine().trim();
            if (nombre.isEmpty()) {
                System.out.println(" El nombre no puede estar vacío.");
            }
        }
        return nombre;
    }
    public int leerNitConductor() {
        int nit = -1;
        while (nit <= 0) {
            System.out.print("NIT del nuevo conductor: ");
            try {
                nit = scanner.nextInt();
                scanner.nextLine();
                if (nit <= 0) System.out.println("El NIT debe ser un número positivo.");
            } catch (Exception e) {
                System.out.println("Error: Ingrese solo números para el NIT.");
                scanner.nextLine(); //limpieza
            }
        }
        return nit;
    }
}
