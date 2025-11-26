// Clase padre Usuario
public class Usuario {
    // Atributos privados
    private String nombre;
    private String id;
    private String email;
    
    // Constructor
    public Usuario(String nombre, String id, String email) {
        this.nombre = nombre;
        this.id = id;
        this.email = email;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    // Método para mostrar información del usuario
    public void mostrarInformacion() {
        System.out.println("INFORMACIÓN DEL USUARIO");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
    }
    
    // Sobrescribir toString()
    @Override
    public String toString() {
        return "Usuario: " + nombre + " (ID: " + id + ")";
    }
}