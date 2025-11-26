public class Estudiante extends Usuario {
    
    private String programa;
    
    
    public Estudiante(String nombre, String id, String email, String programa) {
        super(nombre, id, email); 
        this.programa = programa;
    }
    
    
    public String getPrograma() {
        return programa;
    }
    
    public void setPrograma(String programa) {
        this.programa = programa;
    }
    
    
    public void solicitarProrroga() {
        System.out.println("El estudiante " + getNombre() + " ha solicitado una prórroga de su reserva.");
    }
    
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Tipo: ESTUDIANTE");
        System.out.println("Programa: " + programa);
    }
    
   
    @Override
    public String toString() {
        return "Estudiante: " + getNombre() + " - " + programa;
    }
}