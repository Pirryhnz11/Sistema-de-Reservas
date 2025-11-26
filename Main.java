public class Main {
    public static void main(String[] args) {
        System.out.println("SISTEMA DE RESERVAS");

        
        
        Estudiante estudiante1 = new Estudiante(
            "mateo tabares", 
            "EST001", 
            "mateo.tabares@universidad.edu", 
            "artes visuales"
        );
        
        Estudiante estudiante2 = new Estudiante(
            "camilo buritica", 
            "EST002", 
            "camilo.buritica@universidad.edu", 
            "Administración de Empresas"
        );
        
        Profesor profesor1 = new Profesor(
            "Juan Pérez", 
            "PROF001", 
            "juan.perez@universidad.edu", 
            "Ingeniería"
        );
    
        estudiante1.mostrarInformacion();
        System.out.println();
        
        estudiante2.mostrarInformacion();
        System.out.println();
        
        profesor1.mostrarInformacion();
        System.out.println();
        

        estudiante1.solicitarProrroga();
        profesor1.reservarConPrioridad();
        
        
        
        Recurso sala1 = new Recurso(
            "Sala de Estudio A", 
            "SALA-001", 
            "Sala", 
            8
        );
        
        Recurso cancha1 = new Recurso(
            "Cancha de Fútbol Principal", 
            "CANCHA-001", 
            "Cancha", 
            22
        );
        
        Recurso equipo1 = new Recurso(
            "Portátil HP EliteBook", 
            "PC-001", 
            "Equipo de Cómputo", 
            1
        );
        
        
        sala1.mostrarInformacion();
        System.out.println();
        
        cancha1.mostrarInformacion();
        System.out.println();
        
        equipo1.mostrarInformacion();
        

        
        SistemaReservas sistema = new SistemaReservas("Sistema de Reservas  ");
        
        
        Reserva reserva1 = new Reserva(
            estudiante1, 
            sala1, 
            "2024-12-15", 
            "14:00", 
            "16:00"
        );
        
        Reserva reserva2 = new Reserva(
            profesor1, 
            cancha1, 
            "2024-12-16", 
            "10:00", 
            "12:00"
        );
        
        Reserva reserva3 = new Reserva(
            estudiante2, 
            equipo1, 
            "2024-12-17", 
            "08:00", 
            "10:00"
        );
        
        
        sistema.agregarReserva(reserva1);
        sistema.agregarReserva(reserva2);
        sistema.agregarReserva(reserva3);
        

        sistema.mostrarTodasLasReservas();
        
        
        sistema.buscarReservasPorUsuario("mateo tabares");
        
        
        System.out.println(estudiante1.toString());
        System.out.println(profesor1.toString());
        System.out.println(sala1.toString());
        System.out.println(reserva1.toString());
        
        
    
        System.out.println("Total de reservas en el sistema: " + 
                         sistema.obtenerTotalReservas());
        System.out.println("\n Sistema funcionando correctamente.");
    }
}