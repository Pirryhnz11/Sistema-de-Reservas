// Clase hija Profesor que hereda de Usuario
public class Profesor extends Usuario {
    // Atributo propio
    private String departamento;
    
    // Constructor
    public Profesor(String nombre, String id, String email, String departamento) {
        super(nombre, id, email); // Llama al constructor del padre
        this.departamento = departamento;
    }
    
    // Getter y Setter del atributo propio
    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    // Método propio: reservar con prioridad
    public void reservarConPrioridad() {
        System.out.println("El profesor " + getNombre() + 
                         " del departamento de " + departamento + 
                         " tiene prioridad en las reservas.");
    }
    
    // Sobrescribir el método mostrarInformacion()
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método del padre
        System.out.println("Tipo: PROFESOR");
        System.out.println("Departamento: " + departamento);
    }
    
    // Sobrescribir toString()
    @Override
    public String toString() {
        return "Profesor: " + getNombre() + "Departamento " + departamento;
    }
}