package Modelo;

 public class Vehiculo {
    private String id ;
    private String modelo;
    private String placa;
    private Conductor conductor;
    private double kmRecorridos;
    private int nitTemporal;
    //constructor 
    public Vehiculo(String modelo, String placa, String id, Conductor conductor, double kmRecorridos) {
        this.modelo = modelo;
        this.placa = placa;
        this.id = id;
        this.conductor = conductor;
        this.kmRecorridos = kmRecorridos;
    }
    //Constructor de Texto a objeto
    public Vehiculo(String lineaTexto){
        String[] atributos = lineaTexto.split(",");
        this.id = atributos[0];
        this.modelo = atributos[1];
        this.placa = atributos[2];
        this.kmRecorridos = Double.parseDouble(atributos[3]); 
        if (!atributos[4].equals("sin conductor asignado")){
            this.nitTemporal = Integer.parseInt(atributos[4]);
        }
    }
    //Metodo para imprimir la informaicon basica
    public String mostrarInfo(){
        return "ID: " + id + "\n" +
               "Modelo: " + modelo +"\n" +
               "Placa: " + placa + "\n" +
               "Conductor: " + conductor + "\n" +
                "Informacion del conductor: " + conductor.mostrarInfo() +
               "Recorrido del viaje: " + kmRecorridos ; 
    }
    //metodo de Obejto a Constructor
    public String guardarVehiculos(){
        String nitConductor;
        nitConductor = (conductor != null) ? String.valueOf(conductor.getNit()) : "sin conductor asignado";
        return id + "," + modelo + "," + placa + "," + kmRecorridos + "," + nitConductor ;   
    }
    //getters
    public String getModelo() {return modelo; }
    public String getPlaca() {return placa; }
    public String getId() {return id ; }
    public Conductor getConductor() { return conductor; }
    public double getKmRecorridos() { return kmRecorridos;}
    public int getNitTemporal() { return nitTemporal; }
    //setters
    public void setModelo(String modelo) {this.modelo = modelo;}
    public void setPlaca(String placa) {this.placa = placa;}
    public void setId(String id) {this.id = id;}    
    public Conductor setConductor(Conductor conductor) { this.conductor = conductor; return null;}
    public void setKmRecorridos(double kmReocrridos) { this.kmRecorridos = kmRecorridos ;}  
}
