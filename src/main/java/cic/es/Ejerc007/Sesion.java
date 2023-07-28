package cic.es.Ejerc007;

public class Sesion {
    private String pelicula;
    private String hora;
    private Sala sala;

    public Sesion(String pelicula, String hora, Sala sala) {
        this.pelicula = pelicula;
        this.hora = hora;
        this.sala = sala;
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

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Sesion [pelicula=" + pelicula + ", hora=" + hora + ", sala=" + sala + "]";
    }
}
