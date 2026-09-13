package controller;

import Modelo.GestorDeVehiculos;
import Modelo.GestorDeConductores;
import Modelo.Conductor;
import Modelo.Vehiculo ;
import Vista.Vista;
import java.util.List;


public class Controller {
    private final GestorDeVehiculos gestorDeVehiculos;
    private final GestorDeConductores gestorDeConductores;
    private final Vista vista;

    public Controller() {
        this.vista = new Vista();
        this.gestorDeConductores = new GestorDeConductores();
        this.gestorDeVehiculos = new GestorDeVehiculos(this.gestorDeConductores);
    }
    public void ejecutar() {
        int opcion;
        do
        {
            vista.mostrarMenu();
            opcion = vista.leerOpcion();
            switch (opcion) {
                case 1: String id = vista.leerID();
                        if (gestorDeVehiculos.buscarPorIdVehiculo(id) != null) {
                            System.out.println("ERROR: El ID de vehículo " + id + " ya está registrado.");
                            break;
                        }
                        String modelo = vista.leerModelo();
                        String placa = vista.leerPlaca();
                        double km = vista.leerCantidadDeKilometros();
                        System.out.println("\n--- Lista de Conductores en el Sistema ---");
                        if (gestorDeConductores.buscarTodos().isEmpty()) {
                            System.out.println("No hay conductores creados. Registre uno primero en la opción 2.");
                            break;
                        }
                        for (Conductor c : gestorDeConductores.buscarTodos()) {
                            System.out.println("• Nombre: " + c.getNombre() + " | NIT: " + c.getNit());
                        }
                        System.out.println("---------------------------------------");
                        int nitConductor = vista.SeleccionarNitDeConductor();
                        Conductor conductorEncontrado = gestorDeConductores.buscarPorNit(nitConductor);
                        if(conductorEncontrado != null){
                            Vehiculo nVehiculo = new Vehiculo(id,modelo,placa,conductorEncontrado,km);
                            gestorDeVehiculos.agregarVehiculos(nVehiculo);
                            System.out.println(" Vehiculo agregado con exito ");
                        }else{
                            System.out.println(" no hay conductor con ese nit. ");
                        }
                        break;
                        
                case 2: String nombre = vista.leerNombreConductor();
                        int nit = vista.leerNitConductor();
                        if (gestorDeConductores.buscarPorNit(nit) != null) {
                            System.out.println("ERROR: El NIT " + nit + " ya pertenece a un conductor registrado.");
                            break;
                        }
                        Conductor nuevoConductor = new Conductor(nombre,nit);
                        gestorDeConductores.agregarConductor(nuevoConductor);
                        System.out.println(" Conductor agregado con éxito ");
                        break;

                case 3: 
                        if(gestorDeVehiculos.buscarTodos().isEmpty()){
                            System.out.println(" no hay registro de vehiculos aún. ");
                        }else{
                           System.out.println( " listado de vehiculos ");
                           for(Vehiculo v : gestorDeVehiculos.buscarTodos()){
                               System.out.println( v.mostrarInfo());
                               System.out.println("-----------------------");
                           }                            
                        }
                        break;
                        
                case 4:  
                        if (gestorDeConductores.buscarTodos().isEmpty()) {
                            System.out.println("No hay registro de conductores aún.");
                        } else {
                            System.out.println("\n--- LISTADO DE CONDUCTORES ---");
                            for (Conductor c : gestorDeConductores.buscarTodos()) {
                                System.out.println("Nombre: " + c.getNombre() + " | NIT: " + c.getNit());
                            }
                        }
                        break;
                case 5: System.out.println(" Saliendo... ");
                break;
                default: System.out.println(" opcion invalida "); 
                break ;
            }
        } while (opcion != 5);
    }
}

