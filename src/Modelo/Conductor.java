package Modelo;

public class Conductor {
    private  String nombre;
    private  int nit;
    
    //constructor 
    public  Conductor(String nombre, int nit) 
    {
        this.nombre = nombre;
        this.nit = nit;
    }
    //Constructor de Archivo a Objeto
    public Conductor(String lineaTexto){
        String[] atributos = lineaTexto.split(",");
        this.nombre = atributos[0];
        this.nit = Integer.parseInt(atributos[1]);
       
    }
    //Metodos
    public String mostrarInfo(){
        return "NOMBRE: " + nombre + "\n" +
               "NIT: " + nit +"\n";
    }
    public String guardarConductor(){
     return nombre + "," + nit;  
    }
    //getters
    public String getNombre() {return nombre;}
    public int getNit() {return nit;}
    //setters
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setId(int nit) {this.nit = nit;}
    
    

}
    



