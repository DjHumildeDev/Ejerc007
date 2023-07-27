package cic.es.Ejerc007;

public class Entrada {
    private Sala sala;
    private Sesion sesion;
    private String pelicula;
    private double precio;

    
    public Entrada(Sala sala, Sesion sesion, String pelicula, double precio) {
        this.sala = sala;
        this.sesion = sesion;
        this.pelicula = pelicula;
        this.precio = precio;
    }
    public Sala getSala() {
        return sala;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
    }
    public Sesion getSesion() {
        return sesion;
    }
    public void setSesion(Sesion sesion) {
        this.sesion = sesion;
    }
    public String getPelicula() {
        return pelicula;
    }
    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Entrada [sala=" + sala + ", sesion=" + sesion + ", pelicula=" + pelicula + ", precio=" + precio + "]";
    }

    
}
