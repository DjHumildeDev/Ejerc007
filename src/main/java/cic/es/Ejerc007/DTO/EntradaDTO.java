package cic.es.Ejerc007.DTO;



public class EntradaDTO {
    private int id;
    
    private SesionDTO sesion;
    private static final double precio=5;
    
    public EntradaDTO(int id, SesionDTO sesion) {
        this.id = id;
        this.sesion = sesion;
    }
    public EntradaDTO(SesionDTO sesion) {
        this.sesion = sesion;
        
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public SesionDTO getSesion() {
        return sesion;
    }
    public void setSesion(SesionDTO sesion) {
        this.sesion = sesion;
    }
    public static double getPrecio() {
        return precio;
    }
}   
