public class Profesor extends Usuario {
    
    private String departamento;
    
    public Profesor(String nombre, String id, String email, String departamento) {
        super(nombre, id, email); 
        this.departamento = departamento;
    }
    
    
    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    public void reservarConPrioridad() {
        System.out.println("El profesor " + getNombre() + 
                         " del departamento de " + departamento + 
                         " tiene prioridad en las reservas.");
    }
    
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Tipo: PROFESOR");
        System.out.println("Departamento: " + departamento);
    }
    
    @Override
    public String toString() {
        return "Profesor: " + getNombre() + "Departamento " + departamento;
    }
}