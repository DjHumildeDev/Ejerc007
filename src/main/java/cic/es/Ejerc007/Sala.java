package cic.es.Ejerc007;

public class Sala {

    private int asientos;
    private String nombre;

    public Sala(int asientos, String nombre) {
        this.asientos = asientos;
        this.nombre = nombre;
    }

    public int getAsientos() {
        return asientos;
    }

    @Override
    public String toString() {
        return "Sala [asientos=" + asientos + ", nombre=" + nombre + "]";
    }
}
