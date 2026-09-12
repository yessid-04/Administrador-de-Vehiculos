package Modelo;

 public class Vehiculo {
    private String id ;
    private String modelo;
    private String placa;
    private Conductor conductor;
    private Viaje viaje;

    //constructor 
    public Vehiculo(String modelo, String placa, String id, Conductor conductor, Viaje viaje) {
        this.modelo = modelo;
        this.placa = placa;
        this.id = id;
        this.conductor = conductor;
        this.viaje = viaje ;
    }
    //Constructor de conversion
    public Vehiculo(String lineaTexto){
        String[] atributos = lineaTexto.split(",");
        this.id = atributos[0];
        this.modelo = atributos[1];
        this.placa = atributos[2];
    }
    //Metodos
    public String mostrarInfo(){
        return "ID: " + id + "\n" +
               "Modelo: " + modelo +"\n" +
               "Placa: " + placa + "\n" +
               "Conductor: " + conductor + "\n" + 
               "Recorrido del viaje: " + (viaje.getCantidadDeKM()) ; 
    }
    public String guardarVehiculos(){
     return id + "," + modelo + "," + placa ;   
    }
    //getters
    public String getModelo() {return modelo; }
    public String getPlaca() {return placa; }
    public String getId() {return id ; }
    public Conductor getConductor() { return conductor; }
    public Viaje getViaje() { return viaje;}
    
    //setters
    public void setModelo(String modelo) {this.modelo = modelo;}
    public void setPlaca(String placa) {this.placa = placa;}
    public void setId(String id) {this.id = id;}    
    public Conductor setConductor(Conductor conductor) { this.conductor = conductor; return null;}
    public Viaje setViaje(Viaje viaje) { this.viaje = viaje ;return null;}
    
}

