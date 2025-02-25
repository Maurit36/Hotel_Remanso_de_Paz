package co.edu.uniquindio.HotelRemansoDePaz.service;

import co.edu.uniquindio.HotelRemansoDePaz.model.*;
import java.time.LocalDate;

public class Servicio implements IConsumible {
    String nombreServicio;

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "nombreServicio='" + nombreServicio + '\'' +
                '}';
    }

    Cliente buscarCliente(String dni) {
        return null;
    }

    Habitacion buscarHabitacion(int numero) {
        return null;
    }

    Reserva crearReserva(String dni,
                         String nombre,
                         String correo,
                         LocalDate fechaInicio,
                         LocalDate fechaFin,
                         int numeroHabitacion,
                         int cantidadPersonas) throws Exception {
        return null;
    }

    Reserva obtenerReserva(int codigoHabitacion) {
        return null;
    }

    void liberarHabitacion(int numero) {
    }

    @Override
    public String consumir() {
        return "";
    }

    public String reservar() {
        return null;
    }
}