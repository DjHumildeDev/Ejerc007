package cic.es.Ejerc007;

public class Sesion {
    private String pelicula;
    private String hora;
    public Sesion(String pelicula, String hora) {
        this.pelicula = pelicula;
        this.hora = hora;
    }
    public String getPelicula() {
        return pelicula;
    }
    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    @Override
    public String toString() {
        return "Sesion [pelicula=" + pelicula + ", hora=" + hora + "]";
    }

    
}
