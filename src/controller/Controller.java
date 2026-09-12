package controller;

import Modelo.GestorDeVehiculos;
import Vista.Vista;
import java.util.List;


public class Controller {
    private final GestorDeVehiculos modelo;
    private final Vista vista;

    public Controller() {
        this.modelo = new GestorDeVehiculos();
        this.vista = new Vista();
    }

    public void ejecutar() {
        int opcion;
        do {
            vista.mostrarMenu();
            opcion = vista.leerOpcion();
            switch (opcion) {
                case 1:  break;
                case 2:  break;
                case 3:  break;
                case 4: vista.mostrarMensaje("Saliendo..."); break;
                default: vista.mostrarMensaje("Opción inválida.");
            }
        } while (opcion != 4);
    }

   
}