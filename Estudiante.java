// Clase hija Estudiante que hereda de Usuario
public class Estudiante extends Usuario {
    // Atributo propio
    private String programa;
    
    // Constructor
    public Estudiante(String nombre, String id, String email, String programa) {
        super(nombre, id, email); // Llama al constructor del padre
        this.programa = programa;
    }
    
    // Getter y Setter del atributo propio
    public String getPrograma() {
        return programa;
    }
    
    public void setPrograma(String programa) {
        this.programa = programa;
    }
    
    // Método propio: solicitar prórroga de reserva
    public void solicitarProrroga() {
        System.out.println("El estudiante " + getNombre() + " ha solicitado una prórroga de su reserva.");
    }
    
    // Sobrescribir el método mostrarInformacion()
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método del padre
        System.out.println("Tipo: ESTUDIANTE");
        System.out.println("Programa: " + programa);
    }
    
    // Sobrescribir toString()
    @Override
    public String toString() {
        return "Estudiante: " + getNombre() + " - " + programa;
    }
}