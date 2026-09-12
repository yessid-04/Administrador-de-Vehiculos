package Modelo;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class GestorDeConductores {
    private final List<Conductor> conductores; 
    //constructor
    public GestorDeConductores() {
       this.conductores = new ArrayList<>();
       File archivo = new File("conductores.txt");
       if (archivo.exists()) {
            try {
                FileReader LeerArchivo = new FileReader(archivo);
                try (BufferedReader leerLineas = new BufferedReader(LeerArchivo)) {
                    String linea;
                    while ((linea = leerLineas.readLine()) != null) {
                        Conductor nuevoConductor = new Conductor(linea);
                        this.conductores.add(nuevoConductor);
                    }
                }
            } catch (IOException e) {
                System.out.println("no se pudo abrir el archivo" + e.getMessage());
              }
        } else {
            System.out.println("No hay archivo, se empezará desde cero.");
          }
    }
    //metodo para agregar un nuevo conductor al archivo
    public void agregarConductor(Conductor c) {
        conductores.add(c);
        try {
            FileWriter puente = new FileWriter("conductores.txt", true);
            PrintWriter escribir = new PrintWriter(puente);
            String textoDelConductor = c.guardarConductor();
            escribir.println(textoDelConductor);
            escribir.close();
            System.out.println("Conductor guardado con exito");

        } catch (IOException e) {
            System.out.println("No se pudo guardar en el archivo: " + e.getMessage());
        }
    }
    //en listar todos los conductores
    public List<Conductor> buscarTodos() {
        return new ArrayList<>(conductores);
    }
    //filtrar por nit de conductor
    public Conductor buscarPorNit(int nit) {
        for (Conductor c : conductores) {
            if (c.getNit() == nit) { 
                return c;
            }
        }
        return null;
    }
}
