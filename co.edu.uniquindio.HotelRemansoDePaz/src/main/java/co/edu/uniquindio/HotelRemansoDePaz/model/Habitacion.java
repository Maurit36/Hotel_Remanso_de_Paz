package co.edu.uniquindio.HotelRemansoDePaz.model;

import co.edu.uniquindio.HotelRemansoDePaz.enums.TipoHabitacion;

public class Habitacion {
    public int numero;
    public TipoHabitacion tipoHabitacion;
    public float precio;
    public void setDisponible(boolean b) {
    }

    public Habitacion(int numero, TipoHabitacion tipoHabitacion, float precio) {
        this.numero = numero;
        this.tipoHabitacion = tipoHabitacion;
        this.precio = precio;
    }

    public Habitacion() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numero=" + numero +
                ", tipoHabitacion=" + tipoHabitacion +
                ", precio=" + precio +
                '}';
    }
}