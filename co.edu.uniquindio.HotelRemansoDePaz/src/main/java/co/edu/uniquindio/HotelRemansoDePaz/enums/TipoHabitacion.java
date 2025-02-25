package co.edu.uniquindio.HotelRemansoDePaz.enums;

public enum TipoHabitacion {
    SENCILLA("Sencilla", 150.000F), DOBLE("Doble", 280.000F),
    SUITE("Suite", 450.000F);

    private final String nombre;
    private final float precio;

    TipoHabitacion(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }
}