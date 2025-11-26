import java.util.ArrayList;

public class SistemaReservas {
    
    private ArrayList<Reserva> listaReservas;
    private String nombreSistema;
    
    
    public SistemaReservas(String nombreSistema) {
        this.nombreSistema = nombreSistema;
        this.listaReservas = new ArrayList<>();
    }
    
    public void agregarReserva(Reserva reserva) {
        listaReservas.add(reserva);
        System.out.println("Reserva agregada exitosamente al sistema.");
    }
    
    
    public void mostrarTodasLasReservas() {
        System.out.println( nombreSistema.toUpperCase());
        System.out.println("Total de reservas: " + listaReservas.size());
        
        if (listaReservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
        } else {
            for (int i = 0; i < listaReservas.size(); i++) {
                System.out.println("\nRESERVA NUMERO=" + (i + 1) );
                listaReservas.get(i).mostrarInformacion();
            }
        }
    }
    
    
    public void buscarReservasPorUsuario(String nombreUsuario) {
        System.out.println("\n Buscando reservas de: " + nombreUsuario);
        boolean encontrado = false;
        
        for (Reserva reserva : listaReservas) {
            if (reserva.getUsuario().getNombre().equalsIgnoreCase(nombreUsuario)) {
                reserva.mostrarInformacion();
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontraron reservas para este usuario.");
        }
    }
    
    public int obtenerTotalReservas() {
        return listaReservas.size();
    }
    
    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }
}