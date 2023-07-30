package cic.es.Ejerc007.DTO;

public class SesionDTO {

    private int id;
    private SalaDTO sala;
    private String pelicula;
    private String hora;
    
    public SesionDTO(int id, SalaDTO sala, String pelicula, String hora) {
        this.id = id;
        this.sala = sala;
        this.pelicula = pelicula;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SalaDTO getSala() {
        return sala;
    }

    public void setSala(SalaDTO sala) {
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

    
    


}
