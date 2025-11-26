// Clase Recurso
public class Recurso {
    // Atributos privados
    private String nombre;
    private String codigo;
    private String tipo; // sala, cancha, equipo
    private int capacidad;
    
    // Constructor
    public Recurso(String nombre, String codigo, String tipo, int capacidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getCapacidad() {
        return capacidad;
    }
    
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    // Método para mostrar información del recurso
    public void mostrarInformacion() {
        System.out.println("INFORMACIÓN DEL RECURSO");
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Capacidad: " + capacidad + " personas");
    }
    
    // Sobrescribir toString()
    @Override
    public String toString() {
        return tipo + ": " + nombre + " (Código: " + codigo + ")";
    }
}