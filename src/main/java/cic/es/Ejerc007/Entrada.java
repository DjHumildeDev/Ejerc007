package cic.es.Ejerc007;

public class Entrada {

    private Sesion sesion;
    private double precio;

    public Entrada(Sesion sesion, double precio) {

        this.sesion = sesion;
        this.precio = precio;
    }

    public Sesion getSesion() {
        return sesion;
    }

    public void setSesion(Sesion sesion) {
        this.sesion = sesion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Entrada [sesion=" + sesion + ", precio=" + precio + "]";
    }
}
