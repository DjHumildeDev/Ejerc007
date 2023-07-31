package cic.es.Ejerc007.DTO;

public class SalaDTO {
    private int asientos;
    private String nombre;

    public SalaDTO(int asientos, String nombre) {
        this.asientos = asientos;
        this.nombre = nombre;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "SalaDTO [asientos=" + asientos + ", nombre=" + nombre + "]";
    }

    
}
