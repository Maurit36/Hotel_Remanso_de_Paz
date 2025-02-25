package co.edu.uniquindio.HotelRemansoDePaz.model;

import co.edu.uniquindio.HotelRemansoDePaz.enums.EstadoReserva;
import java.time.LocalDate;

public class Reserva {
    private Cliente cliente;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private Habitacion habitacion;
    private int cantidadPersonas;
    private String codigo;
    private EstadoReserva estadoReserva;
    private float valorTotal;

    public Reserva(Cliente cliente,
                   LocalDate fechaEntrada,
                   LocalDate fechaSalida,
                   Habitacion habitacion,
                   int cantidadPersonas,
                   String codigo,
                   EstadoReserva estadoReserva,
                   float valorTotal) {
        this.cliente = cliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.habitacion = habitacion;
        this.cantidadPersonas = cantidadPersonas;
        this.codigo = codigo;
        this.estadoReserva = estadoReserva;
        this.valorTotal = valorTotal;
    }

    public Reserva() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public EstadoReserva getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(EstadoReserva estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "cliente=" + cliente +
                ", fechaEntrada=" + fechaEntrada +
                ", fechaSalida=" + fechaSalida +
                ", habitacion=" + habitacion +
                ", cantidadPersonas=" + cantidadPersonas +
                ", codigo='" + codigo + '\'' +
                ", estadoReserva=" + estadoReserva +
                ", valorTotal=" + valorTotal +
                '}';
    }
}