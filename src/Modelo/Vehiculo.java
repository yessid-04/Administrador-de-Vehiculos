package Modelo;

 public class Vehiculo {
    private String id ;
    private String modelo;
    private String placa;
    private Conductor conductor;
    private double kmRecorridos;

    //constructor 
    public Vehiculo(String modelo, String placa, String id, Conductor conductor, double kmRecorridos) {
        this.modelo = modelo;
        this.placa = placa;
        this.id = id;
        this.conductor = conductor;
        this.kmRecorridos = kmRecorridos;
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
               "Recorrido del viaje: " + kmRecorridos ; 
    }
    public String guardarVehiculos(){
     return id + "," + modelo + "," + placa ;   
    }
    //getters
    public String getModelo() {return modelo; }
    public String getPlaca() {return placa; }
    public String getId() {return id ; }
    public Conductor getConductor() { return conductor; }
    public double getKmRecorridos() { return kmRecorridos;}
    
    //setters
    public void setModelo(String modelo) {this.modelo = modelo;}
    public void setPlaca(String placa) {this.placa = placa;}
    public void setId(String id) {this.id = id;}    
    public Conductor setConductor(Conductor conductor) { this.conductor = conductor; return null;}
    public double setKmRecorridos(double kmReocrridos) { this.kmRecorridos = kmRecorridos ;return 0;
}
    
}

