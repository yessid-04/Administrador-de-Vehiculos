package Modelo;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class GestorDeVehiculos {
    private final List<Vehiculo> vehiculos; 
    
    //constructor
    public GestorDeVehiculos() {
       this.vehiculos = new ArrayList<>();
       File archivo = new File("vehiculos.txt");
       if (archivo.exists()) {
            try {
                FileReader LeerArchivo = new FileReader(archivo);
                try (BufferedReader leerLineas = new BufferedReader(LeerArchivo)) {
                    String linea;
                    while ((linea = leerLineas.readLine()) != null) {
                        Vehiculo nuevoVehiculo = new Vehiculo(linea);
                        this.vehiculos.add(nuevoVehiculo);
                    }
                }
            } catch (IOException e) {
                System.out.println("no se pudo abrir el archivo" + e.getMessage());
              }
        } else {
            System.out.println("No hay archivo, se empezará desde cero.");
          }
    }
    public void agregarVehiculos(Vehiculo v) {
        vehiculos.add(v);
        try {
            FileWriter puente = new FileWriter("vehiculos.txt", true);
            PrintWriter escribir = new PrintWriter(puente);
            String textoDelVehiculo = v.guardarVehiculos();
            escribir.println(textoDelVehiculo);
            escribir.close();
            System.out.println("Vehículo guardado con exito");

        } catch (IOException e) {
            System.out.println("No se pudo guardar en el archivo: " + e.getMessage());
        }
    }
    
    public List<Vehiculo> buscarTodos() {
        return new ArrayList<>(vehiculos);
    }
    public Vehiculo buscarPorIdVehiculo(String id) {
        for (Vehiculo v : vehiculos) {
            if (v.getId().equals(id)) { 
                return v;
            }
        }
        return null;
    }
}
