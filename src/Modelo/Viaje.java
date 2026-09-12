package Modelo;

public class Viaje {
    private int cantidadDeKM;
    public Viaje(int cantidadDeKM) {
        this.cantidadDeKM = cantidadDeKM;
    }
    //Constructor de conversion
    public Viaje(String lineaTexto){
        String[] atributos = lineaTexto.split(",");
        this.nombre = atributos[0];
        
       
    }
    //Metodos
    public String mostrarInfo(){
        return "NOMBRE: " + nombre + "\n" +
               "NIT: " + nit +"\n";
    }
    public String guardarVehiculos(){
     return nombre + "," + nit;  
    }
    public int getCantidadDeKM() {return cantidadDeKM;}
    public void setCantidadDeKM(int cantidadDeKM) {this.cantidadDeKM = cantidadDeKM;}    
}
