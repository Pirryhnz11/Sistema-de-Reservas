public class Reserva {
    private Usuario usuario;
    private Recurso recurso;
    private String fecha;
    private String horaInicio;
    private String horaFin;
    
    public Reserva(Usuario usuario, Recurso recurso, String fecha, 
                   String horaInicio, String horaFin) {
        this.usuario = usuario;
        this.recurso = recurso;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Recurso getRecurso() {
        return recurso;
    }
    
    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getHoraInicio() {
        return horaInicio;
    }
    
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }
    
    public String getHoraFin() {
        return horaFin;
    }
    
    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    
    public void mostrarInformacion() {
        System.out.println("INFORMACIÓN DE LA RESERVA");

        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Recurso: " + recurso.getNombre());
        System.out.println("Fecha: " + fecha);
        System.out.println("Horario: " + horaInicio + " - " + horaFin);
    }
    
    @Override
    public String toString() {
        return "Reserva de " + usuario.getNombre() + 
               " para " + recurso.getNombre() + 
               " el " + fecha + " de " + horaInicio + " a " + horaFin;
    }
}